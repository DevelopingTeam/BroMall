package com.team.bromall.service;

import com.team.bromall.dto.ProductQueryParam;
import com.team.bromall.model.PmsProduct;

import java.util.List;

public interface ProductService {
    List<PmsProduct> list(ProductQueryParam queryParam, Integer pageSize, Integer pageNum);
}
