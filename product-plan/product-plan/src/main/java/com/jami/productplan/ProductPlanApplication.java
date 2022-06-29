package com.jami.productplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductPlanApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductPlanApplication.class, args);
	}

}
