package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.dto.*;
import com.plateer.ec1.payment.factory.PaymentServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayService {

    private final PaymentServiceFactory paymentServiceFactory;

    /**
     * 승인
     * @param payInfo
     * @return
     */
    public PayApproveResVO approve(PayInfo payInfo){
        PaymentService service = paymentServiceFactory.getPaymentService(payInfo.getPaymentType());
        service.validateAuth(payInfo);
        return service.approvePay(payInfo);
    }

    /**
     * 취소
     * @param reqVO
     */
    public void cancel(PayCancelReqVO reqVO){
        OriginalOrder originalOrder = getOriginalOrder(reqVO);
        paymentServiceFactory.getPaymentService(originalOrder.getPaymentType()).cancelPay(originalOrder);
    }

    /**
     * 원 주문 조회
     * @param reqVO
     * @return
     */
    private OriginalOrder getOriginalOrder(PayCancelReqVO reqVO){
        return new OriginalOrder();
    }

    /**
     * 망취소
     * @param netCancelReqVO
     */
    public void netCancel(NetCancelReqVO netCancelReqVO){
        paymentServiceFactory.getPaymentService(netCancelReqVO.getPaymentType()).netCancel(netCancelReqVO);
    }
}
