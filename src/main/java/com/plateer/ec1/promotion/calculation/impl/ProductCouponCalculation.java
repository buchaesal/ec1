package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponseProductCouponVO;

public class ProductCouponCalculation implements Calculation {

    @Override
    public ResponseProductCouponVO getCalculationData(RequestPromotionVO reqVO) {
        return null;
    }

    public Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        return null;
    }

    public ResponseProductCouponVO calculateDcAmt(RequestPromotionVO reqVO, Promotion prm){
        return null;
    }

    public ResponseProductCouponVO calculateMaxBenefit(ResponseProductCouponVO reqVO){
        return null;
    }

}
