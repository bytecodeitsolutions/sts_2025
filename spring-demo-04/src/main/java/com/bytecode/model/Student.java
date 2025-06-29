package com.bytecode.model;

public class Student {
	private String name;
	private int rno;

	public Student(String name, int rno) {
	System.out.println("student class ");
		this.name = name;
		this.rno = rno;
	}

	public Student() {
		System.out.println("student");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name using setter");
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		System.out.println("setting rno using setter");
		this.rno = rno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rno=" + rno + "]";
	}
}
