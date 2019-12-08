package com.team.bromall.controller;

import com.github.pagehelper.PageInfo;
import com.team.bromall.model.OmsOrderReturnReason;
import com.team.bromall.service.OrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  后台管理系统-订单退货原因设置
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 17:21
 */
@Controller
public class AdminOrderReturnReasonController {

    @Autowired
    private OrderReturnReasonService returnReasonService;

    @RequestMapping(value = "/admin/orderreturnsetting", method = RequestMethod.GET)
    public String orderReturnSetting(@RequestParam(required = false, defaultValue = "1", value = "page") int page,
                                     @RequestParam(required = false, defaultValue = "20", value = "pageSize") int pageSize,
                                     Model model) {
        List<OmsOrderReturnReason> returnReasonList = returnReasonService.list(pageSize, page);
        PageInfo pageInfo = new PageInfo<>(returnReasonList, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("returnReasonList", returnReasonList);
        return "orderreturnsetting";
    }

    @RequestMapping(value = "/admin/orderreturnsetting", method = RequestMethod.POST)
    public String orderReturnSettingAdd(OmsOrderReturnReason returnReason,
                                        @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                                        @RequestParam(required = false, defaultValue = "20", value = "pageSize") int pageSize,
                                        Model model) {
        int flag = returnReasonService.create(returnReason);
        if (flag > 0) {
            model.addAttribute("msg", "插入成功！");
        }
        else {
            model.addAttribute("msg", "插入失败！");
        }

        List<OmsOrderReturnReason> returnReasonList = returnReasonService.list(pageSize, page);
        PageInfo pageInfo = new PageInfo<>(returnReasonList, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("returnReasonList", returnReasonList);
        return "orderreturnsetting";
    }

    @RequestMapping(value = "/admin/orderreturnsetting/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> orderReturnSettingUpdate(@RequestBody OmsOrderReturnReason reason, Errors errors) {
        reason.setCreateTime(new Date());
        Map<String, String> result = new HashMap<>(16);
        if (errors.hasErrors()) {
            result.put("msg", errors.getAllErrors()
                    .stream().map(x -> x.getDefaultMessage())
                    .collect(Collectors.joining(",")));
            return ResponseEntity.badRequest().body(result);
        }

        int flag = returnReasonService.update(reason.getId(),  reason);
        if (flag > 0) {
            result.put("msg", "更新成功！");
        }
        else {
            result.put("msg", "更新失败！");
        }

        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/admin/orderreturnsetting/delete", method = RequestMethod.POST)
    public ResponseEntity<?> orderReturnSettingDelete(@RequestBody OmsOrderReturnReason reason, Errors errors) {
        Map<String, String> result = new HashMap<>(16);
        if (errors.hasErrors()) {
            result.put("msg", errors.getAllErrors()
                    .stream().map(x -> x.getDefaultMessage())
                    .collect(Collectors.joining(",")));
            return ResponseEntity.badRequest().body(result);
        }

        int flag = returnReasonService.delete(reason.getId());
        if (flag > 0) {
            result.put("msg", "删除成功！");
        }
        else {
            result.put("msg", "删除失败！");
        }

        return ResponseEntity.ok(result);
    }

}
