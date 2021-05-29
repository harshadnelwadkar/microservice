package com.har.micro.microservicelearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;
import feign.form.ContentType;

@SpringBootApplication
//@ConfigurationProperties("currency-exchange")
@EnableFeignClients
@EnableDiscoveryClient
public class ExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeServiceApplication.class, args);
	}
	
	@Bean
	public RequestInterceptor requestInterceptor() {
	  return requestTemplate -> {
	      requestTemplate.header("user", "Harshad");
	      requestTemplate.header("password", "password");
	      //requestTemplate.header("Accept", ContentType.MULTIPART.getMimeType());
	  };
	}

}
