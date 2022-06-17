package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.calculation.impl.CartCouponCalculation;
import com.plateer.ec1.promotion.calculation.impl.PriceDiscountCalculation;
import com.plateer.ec1.promotion.calculation.impl.ProductCouponCalculation;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.enums.PromotionType;
import org.springframework.stereotype.Component;

@Component
public class CalculationFactory {

    public Calculation getPromotionCalculationData(PromotionType type){
        switch(type) {
            case PRC_DC:
                return new PriceDiscountCalculation();
            case PRD_CUP:
                return new ProductCouponCalculation();
            case CART_CUP:
                return new CartCouponCalculation();
            default:
                return null;
        }
    }

}
