package com.plateer.ec1.promotion.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductCouponVO {
    private Product product;
    private List<Promotion> promotionList;
    private String maxBenefitYn;
}
