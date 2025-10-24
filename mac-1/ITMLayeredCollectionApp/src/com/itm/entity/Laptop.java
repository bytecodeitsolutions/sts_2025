package com.itm.entity;

public class Laptop {
	private int lId;
	private String brandName;
	private double price;
	private String model;

	public Laptop(int lId, String brandName, double price, String model) {
		this.lId = lId;
		this.brandName = brandName;
		this.price = price;
		this.model = model;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", brandName=" + brandName + ", price=" + price + ", model=" + model + "]";
	}
}
