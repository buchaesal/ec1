package com.plateer.ec1.order.dto;

import com.plateer.ec1.payment.dto.PayInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private String orderType;
    private String systemType;
    private String orderNo;
    private PayInfo payInfo;
}
