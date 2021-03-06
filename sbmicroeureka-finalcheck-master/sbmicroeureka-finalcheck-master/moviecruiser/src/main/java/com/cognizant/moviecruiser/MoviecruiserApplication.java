package com.cognizant.moviecruiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.*")
@EnableDiscoveryClient
public class MoviecruiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviecruiserApplication.class, args);
	}

}
