package com.plateer.ec1.payment.dto;

import com.plateer.ec1.payment.enums.PaymentType;
import lombok.Data;

@Data
public class OriginalOrder {
    private PaymentType paymentType;
}
