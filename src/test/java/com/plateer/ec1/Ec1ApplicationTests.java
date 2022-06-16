package com.plateer.ec1;

import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.enums.PaymentType;
import com.plateer.ec1.payment.service.PayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ec1ApplicationTests {

	@Autowired
	private PayService payService;

	@Test
	void contextLoads() {
		PayInfo payInfo = new PayInfo();
		payInfo.setPaymentType(PaymentType.INICIS);
		payService.approve(payInfo);
	}

}
