package com.xxx.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.xxx.data.product.dao.mybatis")
public class SpringCloudServerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerProductApplication.class, args);
	}
}
