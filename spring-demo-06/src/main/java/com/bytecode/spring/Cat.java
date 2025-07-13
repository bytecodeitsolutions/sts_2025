package com.bytecode.spring;

public class Cat {
	private int age;
	private String name;
	private double price;
	private String ownerName;
	private String address;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", price=" + price + ", ownerName=" + ownerName + ", address="
				+ address + "]";
	}
}
