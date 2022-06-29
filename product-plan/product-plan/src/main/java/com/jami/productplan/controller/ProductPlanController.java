package com.jami.productplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jami.productplan.model.Product;
import com.jami.productplan.service.ProductPlanService;

@RestController
public class ProductPlanController {
	
	@Autowired
	public ProductPlanService service;
	
	@GetMapping("/product")
	public Product getProductDetails() {
		return service.getProduct();
	}
}
