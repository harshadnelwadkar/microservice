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
public class HelloRestController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String sayHello() {

		return "Hello Harshad from Exchange Service";
	}

	@GetMapping(path = "/hello-world")
	public String sayHelloWorld() {

		return "Say Hello World !!";
	}

}
