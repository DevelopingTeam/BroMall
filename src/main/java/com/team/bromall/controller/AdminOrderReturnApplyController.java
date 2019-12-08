package com.team.bromall.controller;

import com.github.pagehelper.PageInfo;
import com.team.bromall.dto.OrderReturnApplyQueryParam;
import com.team.bromall.dto.OrderReturnDetail;
import com.team.bromall.dto.OrderUpdateStatusParam;
import com.team.bromall.model.OmsOrderReturnApply;
import com.team.bromall.service.OrderReturnApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  后台管理系统-订单退货申请管理
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 14:12
 */
@Controller
public class AdminOrderReturnApplyController {
    @Autowired
    private OrderReturnApplyService returnApplyService;

    @RequestMapping(value = "/admin/orderreturnapplay", method = RequestMethod.GET)
    public String orderReturnApplyList(OrderReturnApplyQueryParam queryParam,
                            @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                            @RequestParam(required = false, defaultValue = "10", value = "pageSize") int pageSize,
                            Model model) {
        List<OmsOrderReturnApply> orderReturnApplies = returnApplyService.list(queryParam, pageSize, page);
        PageInfo pageInfo = new PageInfo<>(orderReturnApplies, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("orderReturnApplies", orderReturnApplies);
        return "orderreturnapplay";
    }

    @RequestMapping(value = "/admin/orderreturnapplay", method = RequestMethod.POST)
    public String orderReturnApplyListPost(OrderReturnApplyQueryParam queryParam,
                                       @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                                       @RequestParam(required = false, defaultValue = "10", value = "pageSize") int pageSize,
                                       Model model) {
        List<OmsOrderReturnApply> orderReturnApplies = returnApplyService.list(queryParam, pageSize, page);
        PageInfo pageInfo = new PageInfo<>(orderReturnApplies, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("orderReturnApplies", orderReturnApplies);
        return "orderreturnapplay";
    }

    @RequestMapping(value = "/admin/orderreturndetail", method = RequestMethod.GET)
    public String orderReturnApplyDetail(@RequestParam(required = false, defaultValue = "1", value = "id") Long id, Model model) {
        OrderReturnDetail returnDetail = returnApplyService.getItem(id);
        model.addAttribute("returnDetail", returnDetail);
        return "orderreturndetail";
    }

    @RequestMapping(value = "/admin/orderreturndetail/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> orderReturnSettingUpdate(@RequestBody OrderUpdateStatusParam param, Errors errors) {
        Map<String, String> result = new HashMap<>(16);
        if (errors.hasErrors()) {
            result.put("msg", errors.getAllErrors()
                    .stream().map(x -> x.getDefaultMessage())
                    .collect(Collectors.joining(",")));
            return ResponseEntity.badRequest().body(result);
        }

        int flag = returnApplyService.updateStatus(param);
        if (flag > 0) {
            result.put("msg", "更新成功！");
        }
        else {
            result.put("msg", "更新失败！");
        }

        return ResponseEntity.ok(result);
    }

}
