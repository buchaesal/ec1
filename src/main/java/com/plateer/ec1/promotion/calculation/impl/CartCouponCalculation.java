package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponseCartCouponVO;
import com.plateer.ec1.promotion.dto.res.ResponseProductCouponVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CartCouponCalculation implements Calculation {

    @Override
    public ResponseCartCouponVO getCalculationData(RequestPromotionVO reqVO) {
        log.info("장바구니 쿠폰 데이터 조회");
        calculateDcAmt(reqVO, getAvailablePromotionData(reqVO));
        return null;
    }

    public ResponseCartCouponVO calculateDcAmt(RequestPromotionVO reqVO, Promotion prm){
        log.info("장바구니 쿠폰 할인 적용 금액 계산");
        return null;
    }

    public Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        log.info("적용 가능 장바구니 쿠폰 데이터 조회");
        return null;
    }

    public ResponseCartCouponVO calculateMaxBenefit(ResponseProductCouponVO reqVO){
        log.info("장바구니 쿠폰 최대혜택 계산");
        return null;
    }

}
