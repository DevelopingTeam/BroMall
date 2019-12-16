package com.team.bromall.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.bromall.dto.ProductQueryParam;
import com.team.bromall.mapper.PmsProductMapper;
import com.team.bromall.model.PmsProduct;
import com.team.bromall.model.PmsProductExample;
import com.team.bromall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public List<PmsProduct> list(ProductQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample productExample = new PmsProductExample();
        PmsProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andDeleteStatusEqualTo(0);
        if (queryParam.getPublishStatus() != null) {
            criteria.andPublishStatusEqualTo(queryParam.getPublishStatus());
        }
        if (queryParam.getVerifyStatus() != null) {
            criteria.andVerifyStatusEqualTo(queryParam.getVerifyStatus());
        }
        if (!StringUtils.isEmpty(queryParam.getKeyword())) {
            criteria.andNameLike("%" + queryParam.getKeyword() + "%");
        }
        if (!StringUtils.isEmpty(queryParam.getProductSn())) {
            criteria.andProductSnEqualTo(queryParam.getProductSn());
        }
        if (queryParam.getBrandId() != null) {
            criteria.andBrandIdEqualTo(queryParam.getBrandId());
        }
        if (queryParam.getProductCategoryId() != null) {
            criteria.andProductCategoryIdEqualTo(queryParam.getProductCategoryId());
        }
        return productMapper.selectByExample(productExample);
    }
}
