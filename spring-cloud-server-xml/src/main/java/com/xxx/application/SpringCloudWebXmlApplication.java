package com.xxx.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudWebXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudWebXmlApplication.class, args);
	}
}
