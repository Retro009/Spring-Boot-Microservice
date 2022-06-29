package com.jami.servicecatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jami.servicecatalog.feignClientService.FeignClientService;
import com.jami.servicecatalog.model.Product;


@RestController
public class ServiceCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	FeignClientService service;
	
	@GetMapping("/")
	public String serviceCatalo() {
		return "service-catalog";
	}
//	@GetMapping("/service-catalog")
//	public Product getProduct() {
//		return restTemplate.getForObject("http://PRODUCT-PLAN/product", Product.class);
//	}
	
	@GetMapping("/service-catalog")
	public Product getProduct() {
		return service.getProduct();
	}
}
