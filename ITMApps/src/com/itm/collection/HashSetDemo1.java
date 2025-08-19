package com.itm.collection;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		Student s1=new Student(111, "Raja", 12893378L);
		Student s2=new Student(222, "Raju", 12893378L);
		Student s3=new Student(333, "Kaju", 128974378L);
		Student s4=new Student(444, "Rani", 128946378L);
		Student s5=new Student(555, "Ramu", 12893378L);
		Student s6=new Student(555, "Ramu", 12893378L);
		Student s7=s4;
		
		HashSet<Student> students=new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
        System.out.println(students);
	}

}
