package com.plateer.ec1.order.dto;

import com.plateer.ec1.order.enums.OrderSystemType;
import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.payment.dto.PayInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderRequest {
    private OrderType orderType;
    private OrderSystemType systemType;
    private String orderNo;
    private PayInfo payInfo;
}
