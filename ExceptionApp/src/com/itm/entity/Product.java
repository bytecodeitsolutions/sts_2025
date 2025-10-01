package com.itm.entity;

public class Product {
	private int pId;
	private String pName;
	private double pPrice;

	private Product[] products;

	public Product(int pId, String pName, double pPrice) {
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public Product[] getProducts() {
		return products;
	}
	
	public int getpId() {
		return pId;
	}

	
	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
}
