/**
 * 
 */
package com.har.currency.convertor.service;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author HN5010449
 *
 */
@Data
public class CurrencyExchange {
	private String from;
	private String to;
	private BigDecimal rate;
	private String exchangePort;
	
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the rate
	 */
	public BigDecimal getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	
	public String getExchangePort() {
		return exchangePort;
	}
	
	public void setExchangePort(String exchangePort) {
		this.exchangePort = exchangePort;
	}


}
