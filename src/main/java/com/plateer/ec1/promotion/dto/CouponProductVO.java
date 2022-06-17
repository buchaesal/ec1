package com.plateer.ec1.promotion.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CouponProductVO {
    private Promotion promotion;
    private List<Product> productList;
    private String maxBenefitYn;
}
