package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.dto.req.NetCancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.res.PayApproveResVO;
import com.plateer.ec1.payment.dto.PayInfo;

public interface PaymentService {

    void validateAuth(PayInfo payInfo);
    PayApproveResVO approvePay(PayInfo payInfo);
    void cancelPay(OriginalOrder originalOrder);
    void netCancel(NetCancelReqVO netCancelReqVO);

}
