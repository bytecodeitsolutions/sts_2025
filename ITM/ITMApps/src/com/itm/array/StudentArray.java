package com.itm.array;

class Student {
	private int rno;
	private String name;

	public Student() {

	}

	public Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
}

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(101, "Raja");
		students[1] = new Student();
		students[1].setRno(102);
		students[1].setName("Rani");
		students[2] = new Student(103, "Raju");
		String msg = StudentDB.printStudentRecord(students);
	    System.out.println(msg);
	}

}
