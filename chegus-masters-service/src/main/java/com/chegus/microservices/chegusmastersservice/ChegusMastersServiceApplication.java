package com.chegus.microservices.chegusmastersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.chegus.microservices"})
@EnableDiscoveryClient
public class ChegusMastersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChegusMastersServiceApplication.class, args);
	}

}
