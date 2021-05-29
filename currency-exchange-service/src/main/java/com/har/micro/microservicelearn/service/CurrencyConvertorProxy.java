package com.har.micro.microservicelearn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "currency-converter")
public interface CurrencyConvertorProxy {

	@GetMapping(path = "config/hello-world")
	public String getHelloWorldCurrencyConvertor();
}
