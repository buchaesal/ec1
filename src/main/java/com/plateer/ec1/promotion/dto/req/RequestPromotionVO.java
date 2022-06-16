package com.plateer.ec1.promotion.dto.req;

import com.plateer.ec1.promotion.dto.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RequestPromotionVO {
    private String memberNo;
    private List<Product> productList;
    private Long couponIssueNo;
}
