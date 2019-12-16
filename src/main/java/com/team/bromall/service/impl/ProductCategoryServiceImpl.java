package com.team.bromall.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.bromall.mapper.PmsProductCategoryMapper;
import com.team.bromall.model.PmsProductCategory;
import com.team.bromall.model.PmsProductCategoryExample;
import com.team.bromall.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;

    @Override
    public List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andParentIdEqualTo(parentId);
        return productCategoryMapper.selectByExample(example);
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return productCategoryMapper.selectByPrimaryKey(id);
    }
}
