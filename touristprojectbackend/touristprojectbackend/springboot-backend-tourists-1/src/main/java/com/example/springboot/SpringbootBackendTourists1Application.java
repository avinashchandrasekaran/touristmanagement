package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootBackendTourists1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendTourists1Application.class, args);
	}

}
