package com.softeletronica.softuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SoftUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftUserApplication.class, args);
	}

}
