package com.plateer.ec1.claim.dto;

import lombok.Data;

@Data
public class ClaimDto {
    private String claimType;
    private Long orderAmount;
    private Long claimAmount;
    private String claimNo;
    private String orderNo;
}
