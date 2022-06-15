package com.plateer.ec1.payment.service.impl;

import com.plateer.ec1.payment.dto.NetCancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.PayApproveResVO;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.service.PaymentService;
import org.springframework.stereotype.Component;


@Component
public class Inicis implements PaymentService {

    public void validateAuth(PayInfo payInfo) {
    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
        System.out.println("이니시스 pc : approvePay");
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder originalOrder) {

    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {

    }

}
