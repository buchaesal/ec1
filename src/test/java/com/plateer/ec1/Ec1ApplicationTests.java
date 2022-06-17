package com.plateer.ec1;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.dto.req.PayCancelReqVO;
import com.plateer.ec1.payment.enums.PaymentType;
import com.plateer.ec1.payment.service.PayService;
import com.plateer.ec1.promotion.dto.req.RequestPromotionVO;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.service.PromotionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ec1ApplicationTests {

	@Autowired
	private OrderService orderService;
	@Autowired
	private PromotionService promotionService;

	@Test
	void contextLoads() {
		PayInfo payInfo = new PayInfo();
		payInfo.setPaymentType(PaymentType.INICIS);
//		payService.cancel(new PayCancelReqVO());

		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setPayInfo(payInfo);
		orderRequest.setSystemType("FO");
		orderRequest.setOrderType("general");
		orderService.order(orderRequest);

	}

	@Test
	@DisplayName("프로모션")
	void test(){
		RequestPromotionVO request = new RequestPromotionVO();

		for (PromotionType value : PromotionType.values()) {
			request.setPromotionType(value);
			promotionService.getApplyData(request);
		}

	}

}
