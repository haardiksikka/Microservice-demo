package com.comviva.microservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String health() {
		return "Ok";
	}
	
	@RequestMapping("/hi")
	public String hi(@RequestParam(value="name", defaultValue="Haardik") String name) {
		 	String greeting = this.restTemplate.getForObject("http://greetings/greetings", String.class);
		    return String.format("%s, %s!", greeting, name);
	}
	
	
	
	@Bean
	@LoadBalanced	
	RestTemplate restTemplate(){
	    return new RestTemplate();
	  }
	
}
