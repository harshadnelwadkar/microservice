/**
 * 
 */
package com.har.micro.microservicelearn.hello;

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
	
	@Value("${currency-exchange.limit}")
	private String limitProperty;
	
	@Value("${currency-exchange.default-currency}")
	private String defaultCurrency;
	
	@RequestMapping(path = "/get/config", method = RequestMethod.GET)
	public String sayHello() {
		
		return "limitProperty:"+limitProperty+"  \n defaultCurrency:"+defaultCurrency;
	}
	
	
	@GetMapping(path = "config/hello-world")
	public String sayHelloWorld() {
		
		return "Say Hello World !!";
	}

}
