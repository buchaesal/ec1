package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponsePriceDcVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceDiscountCalculation implements Calculation {

    @Override
    public ResponsePriceDcVO getCalculationData(RequestPromotionVO reqVO) {
        log.info("가격 할인 데이터 조회");
        return null;
    }

    public Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        log.info("적용 가능 가격 할인 금액 데이터 조회");
        return null;
    }

    public ResponsePriceDcVO calculateDcAmt(RequestPromotionVO reqVO, Promotion prm){
        log.info("가격 할인 적용 금액 계산");
        return null;
    }

}
