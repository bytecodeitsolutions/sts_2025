package com.itm.collection.entity;

public class Employee {
	private int eId;
	private String eName;
	private float salary;
	private int age;

	public Employee(int eId, String eName, float salary, int age) {
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.age = age;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", age=" + age + "]";
	}

}
