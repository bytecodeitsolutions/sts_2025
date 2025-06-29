package com.bytecode.model;

public class Teacher {
	private int tId;
	private String tName;

	public Teacher(int tId, String tName) {
		this.tId = tId;
		this.tName = tName;
		System.out.println("setting teacher data using constructor");
	}

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + "]";
	}
}
