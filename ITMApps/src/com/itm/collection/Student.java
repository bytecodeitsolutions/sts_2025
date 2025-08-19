package com.itm.collection;

import java.util.Objects;

public class Student {
	private int rno;
	private String name;
	private long contact;

	public Student(int rno, String name, long contact) {

		this.rno = rno;
		this.name = name;
		this.contact = contact;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contact, name, rno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return contact == other.contact && Objects.equals(name, other.name) && rno == other.rno;
	}

}
