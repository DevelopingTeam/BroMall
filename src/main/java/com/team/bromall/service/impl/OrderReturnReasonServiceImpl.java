package com.team.bromall.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.bromall.mapper.OmsOrderReturnReasonMapper;
import com.team.bromall.model.OmsOrderReturnReason;
import com.team.bromall.model.OmsOrderReturnReasonExample;
import com.team.bromall.service.OrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 订单原因管理Service
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 17:15
 */
@Service
public class OrderReturnReasonServiceImpl implements OrderReturnReasonService {

    @Autowired
    private OmsOrderReturnReasonMapper returnReasonMapper;
    @Override
    public int create(OmsOrderReturnReason returnReason) {
        returnReason.setCreateTime(new Date());
        return returnReasonMapper.insert(returnReason);
    }

    @Override
    public int update(Long id, OmsOrderReturnReason returnReason) {
        returnReason.setId(id);
        return returnReasonMapper.updateByPrimaryKey(returnReason);
    }

    @Override
    public int delete(Long id) {
        return returnReasonMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        OmsOrderReturnReasonExample example = new OmsOrderReturnReasonExample();
        example.setOrderByClause("sort desc");
        return returnReasonMapper.selectByExample(example);
    }

    @Override
    public OmsOrderReturnReason getItem(Long id) {
        return returnReasonMapper.selectByPrimaryKey(id);
    }
}
