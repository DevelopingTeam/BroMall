package com.team.bromall.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductQueryParam {
    private String productSn;


    private Integer publishStatus;

    private String keyword;

    private Integer verifyStatus;

    private Long brandId;

    private Long productCategoryId;
}
