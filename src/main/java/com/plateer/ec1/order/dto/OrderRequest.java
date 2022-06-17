package com.plateer.ec1.order.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private String orderType;
    private String systemType;
    private String orderNo;
}
