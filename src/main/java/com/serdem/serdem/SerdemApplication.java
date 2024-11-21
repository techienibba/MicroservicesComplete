package com.serdem.serdem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SerdemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerdemApplication.class, args);
	}

}
