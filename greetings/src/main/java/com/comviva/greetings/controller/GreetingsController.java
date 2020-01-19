package com.comviva.greetings.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@Autowired
    Environment environment;
	
	@RequestMapping(value="/")
	public String health() {
		return "Ok";
	}
	
	@RequestMapping(value="/greetings")
	public String greetings() {
		System.out.println("Inside MyRestController::backend...");
		 
        String serverPort = environment.getProperty("local.server.port");
        System.out.println("--------------"+serverPort+"-----------------");
		List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
		  Random rand = new Random();

		  int randomNum = rand.nextInt(greetings.size());
		  return greetings.get(randomNum);
	}
	
}
