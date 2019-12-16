package com.team.bromall.service;

import com.team.bromall.model.PmsProductAttributeCategory;
import com.team.bromall.model.PmsProductCategory;

import java.util.List;

public interface ProductCategoryService {

    PmsProductCategory getItem(Long id);

    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);
}
