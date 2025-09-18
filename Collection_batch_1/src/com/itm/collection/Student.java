package com.itm.collection;

import java.util.Objects;

public class Student {
	private int rno;
	private String name;

	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}

}
