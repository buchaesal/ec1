package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponseCartCouponVO;
import com.plateer.ec1.promotion.dto.res.ResponseProductCouponVO;

public class CartCouponCalculation implements Calculation {

    @Override
    public ResponseCartCouponVO getCalculationData(RequestPromotionVO reqVO) {
        return null;
    }

    public ResponseCartCouponVO calculateDcAmt(RequestPromotionVO reqVO, Promotion prm){
        return null;
    }

    public Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        return null;
    }

    public ResponseCartCouponVO calculateMaxBenefit(ResponseProductCouponVO reqVO){
        return null;
    }

}
