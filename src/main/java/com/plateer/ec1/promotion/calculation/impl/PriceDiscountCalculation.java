package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponsePriceDcVO;

public class PriceDiscountCalculation implements Calculation {

    @Override
    public ResponsePriceDcVO getCalculationData(RequestPromotionVO reqVO) {
        return null;
    }

    public Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        return null;
    }

    public ResponsePriceDcVO calculateDcAmt(RequestPromotionVO reqVO, Promotion prm){
        return null;
    }

}
