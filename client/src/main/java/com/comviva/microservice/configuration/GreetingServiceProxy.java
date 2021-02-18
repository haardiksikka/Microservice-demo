/**
18-Feb-2021
 * 
 */
package com.comviva.microservice.configuration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haardik.sikka
 *
 */
@FeignClient("greet")
public interface GreetingServiceProxy {
	
	@RequestMapping("/greetings")
	public String getGreetings();

}
