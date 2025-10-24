package com.bytecode.collection;

import java.util.Objects;

public class Kutta {
	private int age;
	private String name;
	private double price;

	public Kutta(int age, String name, double price) {
		this.age = age;
		this.name = name;
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Kutta [age=" + age + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kutta other = (Kutta) obj;
		return age == other.age && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
