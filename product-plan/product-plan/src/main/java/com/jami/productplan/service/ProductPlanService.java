package com.jami.productplan.service;

import org.springframework.stereotype.Service;

import com.jami.productplan.model.Product;

@Service
public class ProductPlanService {

	public Product getProduct() {
		
		return new Product(1,"C4 Detonator");
	}

}
