package com.plateer.ec1.promotion.calculation;

import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponseBaseVO;

public interface Calculation {
    public ResponseBaseVO getCalculationData(RequestPromotionVO reqVO);
}
