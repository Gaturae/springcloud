package com.hd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Boot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot2Application.class, args);
	}
}
