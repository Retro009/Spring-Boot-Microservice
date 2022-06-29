package com.jami.servicecatalog.feignClientService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.jami.servicecatalog.model.Product;

@FeignClient(name="PRODUCT-PLAN")
public interface FeignClientService {
	@GetMapping("/product")
	public Product getProduct();
}
