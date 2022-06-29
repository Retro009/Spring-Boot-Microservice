package com.jami.clientmanagement.model;

public class Product {
	private int productId;
	private String productDesc;
	
	public Product() {
		super();
	}
	public Product(int productId, String productDesc) {
		super();
		this.productId = productId;
		this.productDesc = productDesc;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDesc=" + productDesc + "]";
	}
}
