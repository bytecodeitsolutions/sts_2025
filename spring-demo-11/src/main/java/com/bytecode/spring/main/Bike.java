package com.bytecode.spring.main;

public class Bike {
	private String bikeName;

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public void ride() {
		System.out.println("riding ::"+bikeName);

	}
}
