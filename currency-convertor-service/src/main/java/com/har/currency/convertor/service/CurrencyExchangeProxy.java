package com.har.currency.convertor.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "currency-exchange", url = "localhost:8080")
@FeignClient("currency-exchange")
@RibbonClient(name="currency-exchange")
public interface CurrencyExchangeProxy {

	@GetMapping(path = "/rate/{from}/to/{to}")
	public CurrencyExchange getCurrencyConversionDetails(@PathVariable("from") String from,
			@PathVariable("to") String to);

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String sayHello();
}
