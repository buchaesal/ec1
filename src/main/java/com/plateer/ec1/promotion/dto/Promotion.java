package com.plateer.ec1.promotion.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Promotion {
    private Long promotionNo;
    private String cpnKindCd;
    private Long couponIssueNo;
    private String degrCcd;
    private Long dcAmt;
    private String maxBenefitYn;
}
