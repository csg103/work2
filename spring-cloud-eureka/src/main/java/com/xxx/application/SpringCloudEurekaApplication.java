package com.xxx.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {

    public static void main(String[] args1) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args1);
    }
}
