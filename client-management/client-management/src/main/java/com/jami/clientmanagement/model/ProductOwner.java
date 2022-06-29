package com.jami.clientmanagement.model;

public class ProductOwner {
	private int ownerId;
	private String ownerName;
	private Product product;
	
	public ProductOwner() {
		super();
	}
	public ProductOwner(int ownerId, String ownerName, Product product) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.product = product;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "ProductOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", product=" + product + "]";
	}
}
