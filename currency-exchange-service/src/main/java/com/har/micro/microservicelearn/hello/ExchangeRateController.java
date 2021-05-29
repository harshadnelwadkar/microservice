/**
 * 
 */
package com.har.micro.microservicelearn.hello;

import java.math.BigDecimal;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.har.micro.microservicelearn.model.CurrencyExchange;

/**
 * @author HN5010449
 *
 */
@RestController // either can be @Controller
public class ExchangeRateController { 

	@Autowired
	Environment environment;
	
	// @ResponseBody- if the Conroller is not @RestController, we need this
	// annotation
	@RequestMapping(path = "/rate/{from}/to/{to}", method = RequestMethod.GET)
	public CurrencyExchange getCurrencyConversionDetails(@PathVariable("from") String from, @PathVariable("to") String to) {
		CurrencyExchange conversion = new CurrencyExchange();
		conversion.setFrom(from);
		conversion.setTo(to);
		conversion.setRate(new BigDecimal(73.41));
		conversion.setExchangePort(environment.getProperty("local.server.port"));
		return conversion;
	}
	
	@GetMapping(path = "/rate/{from}/abc/{to}")
	public BigDecimal getConversionRate(@PathVariable("from") String from, @PathVariable("to") String to) {
		
		return new BigDecimal(73.74);
	}
	
	@GetMapping(path = "/rate/{from}/abc/{to}", params = "str" )
	public String getConversionRateString(@PathVariable("from") String from, @PathVariable("to") String to) {
		
		return "73.74";
	}
	
}
