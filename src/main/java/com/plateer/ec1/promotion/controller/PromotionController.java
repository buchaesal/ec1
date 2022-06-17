package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.dto.res.ResponseBaseVO;
import com.plateer.ec1.promotion.service.PromotionService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PromotionController {

    private final PromotionService promotionService;

    public ResponseBaseVO getApplyData(RequestPromotionVO reqVO){
        return promotionService.getApplyData(reqVO);
    }

}
