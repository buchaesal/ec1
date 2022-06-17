package com.plateer.ec1.claim.enums;

import com.plateer.ec1.claim.service.creator.*;
import com.plateer.ec1.claim.service.processor.AcceptWithdrawalProcessor;
import com.plateer.ec1.claim.service.processor.CompleteProcessor;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Getter
@RequiredArgsConstructor
public enum ClaimType {

    //일반상품주문취소완료
    GCC(CompleteProcessor::getInstance, GeneralOrderCancelDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.TRUE, ""),
    //모바일쿠폰주문취소접수
    MCA(AcceptWithdrawalProcessor::getInstance, ECouponCancelAcceptDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.TRUE, ""),
    //모바일쿠폰주문취소완료
    MCC(CompleteProcessor::getInstance,         ECouponCancelCompleteDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.FALSE, ""),
    //반품접수
    RA(CompleteProcessor::getInstance,          ReturnAcceptDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.TRUE, ""),
    //반품완료
    RC(CompleteProcessor::getInstance,          ReturnCompleteDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.FALSE, ""),
    //반품철회
    RW(CompleteProcessor::getInstance,          ReturnWithdrawalDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.TRUE, ""),
    //교환접수
    XA(CompleteProcessor::getInstance,          ExchangeAcceptDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.TRUE, ""),
    //교환철회
    XW(CompleteProcessor::getInstance,          ExchangeWithdrawalDataCreator::getInstance, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "");

    private final Supplier<ClaimProcessor> claimProcess;
    private final Supplier<ClaimDataCreator> creator;
    private final List<String> validStatuses;
    private final List<String> productTypes;
    private final Boolean claimNoFlag;
    private final String claimCode;

    public static ClaimDataCreator findCreator(String name) {
        return Arrays.stream(ClaimType.values())
                .filter(type -> type.name().equals(name))
                .findFirst()
                .map(claimType -> claimType.getCreator().get())
                .orElseThrow(()-> new IllegalArgumentException("클레임유형 요청이 잘못되었습니다."));
    }

    public static ClaimProcessor findProcessor(String name) {
        return Arrays.stream(ClaimType.values())
                .filter(type -> type.name().equals(name))
                .findFirst()
                .map(claimType -> claimType.getClaimProcess().get())
                .orElseThrow(()-> new IllegalArgumentException("클레임유형 요청이 잘못되었습니다."));
    }
}
