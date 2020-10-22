package com.footprint.omseurekaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OmsEurekaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsEurekaServiceRegistryApplication.class, args);
	}

}
