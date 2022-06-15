package com.plateer.ec1.payment.service.impl;

import com.plateer.ec1.payment.dto.NetCancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.PayApproveResVO;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class Point implements PaymentService {

    @Override
    public void validateAuth(PayInfo payInfo) {

    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder originalOrder) {

    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {
    }
}
