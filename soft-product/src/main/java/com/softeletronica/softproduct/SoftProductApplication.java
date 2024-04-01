package com.softeletronica.softproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SoftProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftProductApplication.class, args);
	}

}
