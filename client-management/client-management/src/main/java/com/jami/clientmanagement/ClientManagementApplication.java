package com.jami.clientmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientManagementApplication {
	@GetMapping("/")
	public String clientManagemnt() {
		return "client-management";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientManagementApplication.class, args);
	}

}
