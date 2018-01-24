package com.xxx.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudServerOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerOrderApplication.class, args);
	}
}
