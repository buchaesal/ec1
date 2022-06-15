package com.plateer.ec1.payment.dto;

import com.plateer.ec1.payment.enums.PaymentType;
import lombok.Data;

@Data
public class PayInfo {
    private String orrNo;
    private Long payAmount;
    private String type;
    private PaymentType paymentType;
}