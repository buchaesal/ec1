package com.plateer.ec1.payment.manipulator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentDataManipulator {
    public Long insertPaymentData(){
        log.info("결제데이터 insert");
        return null;
    }
}
