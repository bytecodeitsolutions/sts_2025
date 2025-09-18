package com.itm.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ColectionDemo1 {

	public static void main(String[] args) {

		Comparator<Student> c1 = Comparator.comparing(Student::getName).reversed();

		Student s1 = new Student(101, "raja");
		Student s2 = new Student(10, "raju");
		Student s3 = new Student(200, "akarsh");
		Student s4 = new Student(5, "utkarsh");

		TreeSet<Student> hashSet = new TreeSet<Student>(c1);
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		hashSet.add(s4);

		hashSet.stream().filter(s -> s.getName() == "raja").map(x -> x.toString()).forEach(System.out::println);
	}
}

/*
 * Comparator<Student> c1 = (s1, s2) -> s1.getName().compareTo(s2.getName());
 * Comparator<Student> c1 = Comparator.comparing(Student::getName); Student s1 =
 * new Student(101, "raja"); Student s2 = new Student(10, "raju"); Student s3 =
 * new Student(200, "akarsh"); Student s4 = new Student(5, "utkarsh");
 * 
 * TreeSet<Student> hashSet = new TreeSet<Student>(c1); hashSet.add(s1);
 * hashSet.add(s2); hashSet.add(s3); hashSet.add(s4);
 * 
 * System.out.println(hashSet);
 * 
 */
