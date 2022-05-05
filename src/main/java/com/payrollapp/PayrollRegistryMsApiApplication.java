package com.payrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class PayrollRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollRegistryMsApiApplication.class, args);
	}

}
  