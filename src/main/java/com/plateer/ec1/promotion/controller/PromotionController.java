package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.dto.req.PromotionRequestVO;
import com.plateer.ec1.promotion.dto.res.BaseResponseVO;
import com.plateer.ec1.promotion.service.PromotionService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PromotionController {

    private final PromotionService promotionService;

    public BaseResponseVO getApplyData(PromotionRequestVO reqVO){
        return promotionService.getApplyData(reqVO);
    }

}
