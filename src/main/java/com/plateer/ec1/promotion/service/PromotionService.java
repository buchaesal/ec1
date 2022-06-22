package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.req.PromotionRequestVO;
import com.plateer.ec1.promotion.dto.res.BaseResponseVO;
import com.plateer.ec1.promotion.factory.CalculatorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final CalculatorFactory factory;

    public BaseResponseVO getApplyData(PromotionRequestVO reqVO){
        return factory.getPromotionCalculationData(reqVO.getPromotionType()).getCalculationData(reqVO);
    }

}
