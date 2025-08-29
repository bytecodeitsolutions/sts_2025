package com.bytecode.jdbc.ps;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phone;
	private String email;

	public Student(String name, int age, String address, String phone, String email) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
}
