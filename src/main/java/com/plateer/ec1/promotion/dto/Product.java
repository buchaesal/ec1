package com.plateer.ec1.promotion.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String productNo; // 상품번호
    private int productAmt; // 할인이 적용된 가격
    private int productCnt; // 수량
    private String productItemNo; // 단품번호
}
