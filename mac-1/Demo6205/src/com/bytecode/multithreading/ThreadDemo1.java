package com.bytecode.multithreading;

import java.util.Arrays;
import java.util.List;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Student[] s = new Student[5];

		s[0] = new Student(101, "Raja");
		s[1] = new Student(102, "Rani");
		s[2] = new Student(103, "Aryan");
		s[3] = new Student(104, "Ajay");
		s[4] = new Student(105, "Krishna");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		System.out.println("====================");
		for (Student x : s) {
			System.out.println(x);
		}
		
		System.out.println("===============");

		//List<Student> l = Arrays.asList(s);
		//l.stream().filter(s1->s1.getName().equalsIgnoreCase("raja")).forEach(System.out::println);

	}

}
