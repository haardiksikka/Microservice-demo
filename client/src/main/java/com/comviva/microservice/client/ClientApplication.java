package com.comviva.microservice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.comviva.microservice.configuration.RibbonConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "client", configuration = RibbonConfiguration.class)
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
