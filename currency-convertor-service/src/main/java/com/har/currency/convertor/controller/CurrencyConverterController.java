/**
 * 
 */
package com.har.currency.convertor.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.har.currency.convertor.model.ConvertCurrency;
import com.har.currency.convertor.service.CurrencyExchange;
import com.har.currency.convertor.service.CurrencyExchangeProxy;

/**
 * @author HN5010449
 *
 */
@RestController
public class CurrencyConverterController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	@RequestMapping(path="/convert/{amount}/from/{from}/to/{to}", method = RequestMethod.GET)
	public ConvertCurrency convertCurrency(@PathVariable double amount, @PathVariable String from, @PathVariable String to) {
		ConvertCurrency currency = new ConvertCurrency();
		
		
		ResponseEntity<CurrencyExchange> response = restTemplate.getForEntity("http://localhost:8090/currency-exchange/rate/{from}/to/{to}", CurrencyExchange.class, from, to, amount);
		CurrencyExchange conversionrate = response.getBody();
		currency.setFrom(from);
		currency.setTo(to);
		currency.setAmount(new BigDecimal(amount));
		currency.setConvertedAmount(new BigDecimal(amount * conversionrate.getRate().floatValue()));
		currency.setPortOfExchange(conversionrate.getExchangePort());
		
		return currency;
	}
	
	@RequestMapping(path="/convert-feign/{amount}/from/{from}/to/{to}", method = RequestMethod.GET)
	public ConvertCurrency convertCurrencyFeign(@PathVariable double amount, @PathVariable String from, @PathVariable String to) {
		ConvertCurrency currency = new ConvertCurrency();
		//Call Exchange service to get rate		
		CurrencyExchange conversionrate = currencyExchangeProxy.getCurrencyConversionDetails(from, to);
		
		//send response 
		currency.setFrom(conversionrate.getFrom());
		currency.setTo(conversionrate.getTo());
		currency.setAmount(new BigDecimal(amount));
		currency.setConvertedAmount(new BigDecimal(amount * conversionrate.getRate().floatValue()));
		currency.setPortOfExchange(conversionrate.getExchangePort());
		
		return currency;
	}
	
	@RequestMapping(path="/feign-hello", method = RequestMethod.GET)
	public String helloFeign() {
		return currencyExchangeProxy.sayHello();
	}
}
