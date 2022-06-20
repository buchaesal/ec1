package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.calculation.impl.CartCouponCalculation;
import com.plateer.ec1.promotion.calculation.impl.PriceDiscountCalculation;
import com.plateer.ec1.promotion.calculation.impl.ProductCouponCalculation;
import com.plateer.ec1.promotion.enums.PromotionType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CalculationFactory {

    private final Map<PromotionType, Calculation> map = new HashMap<>();

    public CalculationFactory(PriceDiscountCalculation priceDiscountCalculation,
                              ProductCouponCalculation productCouponCalculation,
                              CartCouponCalculation cartCouponCalculation){
        map.put(PromotionType.PRC_DC, priceDiscountCalculation);
        map.put(PromotionType.PRD_CUP, productCouponCalculation);
        map.put(PromotionType.CART_CUP, cartCouponCalculation);
    }

    public Calculation getPromotionCalculationData(PromotionType type){
        try {
            return map.get(type);
        }catch (NullPointerException e){
            throw new IllegalArgumentException("해당하는 프로모션 유형이 없습니다!");
        }
    }

}
