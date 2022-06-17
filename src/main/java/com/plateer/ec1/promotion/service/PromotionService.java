package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponseBaseVO;
import com.plateer.ec1.promotion.factory.CalculationFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final CalculationFactory factory;

    public ResponseBaseVO getApplyData(RequestPromotionVO reqVO){
        return factory.getPromotionCalculationData(reqVO.getPromotionType()).getCalculationData(reqVO);
    }

//    public ResponsePriceDcVO getPriceDiscountApplyData(RequestPromotionVO reqVO){
//        return (ResponsePriceDcVO) factory.getPromotionCalculationData(PromotionType.PRC_DC).getCalculationData(reqVO);
//    }
//
//    public ResponseProductCouponVO getProductCouponApplyData(RequestPromotionVO reqVO){
//        return (ResponseProductCouponVO) factory.getPromotionCalculationData(PromotionType.PRD_CUP).getCalculationData(reqVO);
//    }
//
//    public ResponseCartCouponVO getCartCouponApplyData(RequestPromotionVO reqVO){
//        return null;
//    }

}
