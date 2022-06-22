package com.plateer.ec1.promotion.calculation;

import com.plateer.ec1.promotion.dto.req.PromotionRequestVO;
import com.plateer.ec1.promotion.dto.res.BaseResponseVO;
import com.plateer.ec1.promotion.enums.PromotionType;

public interface Calculator {
    PromotionType getType();
    BaseResponseVO getCalculationData(PromotionRequestVO reqVO);
}
