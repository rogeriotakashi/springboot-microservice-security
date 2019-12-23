package com.roger.projetoxbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ProjetoxBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoxBackendApplication.class, args);
	}

}
