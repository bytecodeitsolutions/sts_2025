package com.itm.collection;

public class Test11 {

	int  id;
	String name;
	
	public Test11(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test11 [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Test11  t1=new Test11(101,"Raja");
		System.out.println(t1);
	}

}
