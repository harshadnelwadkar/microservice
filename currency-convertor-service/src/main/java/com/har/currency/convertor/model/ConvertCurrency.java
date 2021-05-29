/**
 * 
 */
package com.har.currency.convertor.model;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author HN5010449
 *
 */
@Data
public class ConvertCurrency {

	private String name;
	private String from;
	private String to;
	private BigDecimal rate;
	private BigDecimal amount;
	private BigDecimal convertedAmount;
	private String portOfExchange;
	
	
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
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the convertedAmount
	 */
	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}
	/**
	 * @param convertedAmount the convertedAmount to set
	 */
	public void setConvertedAmount(BigDecimal convertedAmount) {
		this.convertedAmount = convertedAmount;
	}
	public String getPortOfExchange() {
		return portOfExchange;
	}
	public void setPortOfExchange(String portOfExchange) {
		this.portOfExchange = portOfExchange;
	}
	
	
}
