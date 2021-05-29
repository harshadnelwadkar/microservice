package com.har.micro.microservicelearn.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.har.micro.microservicelearn.service.CurrencyConvertorProxy;


@RestController
public class TestEurekaNamingController {

	@Autowired
	CurrencyConvertorProxy currencyConvertorProxy; 
	
	
	@GetMapping("/convert/call-exchange-service")
	public String testEurekaNamingservice() {
		
		return currencyConvertorProxy.getHelloWorldCurrencyConvertor();
	}
}
