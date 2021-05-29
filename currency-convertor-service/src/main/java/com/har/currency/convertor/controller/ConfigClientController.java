/**
 * 
 */
package com.har.currency.convertor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HN5010449
 *
 */
@RestController
public class ConfigClientController {
	
	@Value("${exchange-rate-usd}")
	private String exchangeRate;
	
	@Value("${default-currency}")
	private String defaultCurrency;
	
	@RequestMapping(path = "/get/config", method = RequestMethod.GET)
	public String sayHello() {
		
		return "exchangeRate:"+exchangeRate+"  \n defaultCurrency:"+defaultCurrency;
	}
	
	
	@GetMapping(path = "config/hello-world")
	public String sayHelloWorld() {
		
		return "Say Hello World from currency convertor serrvice !!";
	}

}
