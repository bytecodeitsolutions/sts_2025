package com.itm.collection;

import java.util.ArrayList;
import java.util.List;

class Test{
	
}
public class ArrayListDemo1 {

	public static void main(String[] args) {
		Test  t1=new Test();
		//System.out.println(t1 instanceof String);
		Student s1=new Student(111, "Raja", 12893378L);
		Student s2=new Student(222, "Raju", 12893378L);
		Student s3=new Student(333, "Kaju", 128974378L);
		Student s4=new Student(444, "Rani", 128946378L);
		Student s5=new Student(555, "Ramu", 12893378L);
		ArrayList<Student> al = new ArrayList<Student>();
		System.out.println(al.size());
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s5);
		System.out.println(al.toString());
		System.out.println(al instanceof List);
	}

}

/*
 * al.add(100); al.add(20); al.add(10); al.add(20); al.add(null); al.add(null);
 * al.add("java"); al.add(20.5f); al.add(5, 1000);
 * 
 * System.out.println(al);
 * 
 * System.out.println(al.get(1));
 * 
 * //al.addAll(al); System.out.println(al); // al.clear(); boolean
 * x=al.contains(10);
 * 
 * ArrayList al2=new ArrayList<>();
 * 
 * al2.add("python");
 * 
 * boolean y=al.containsAll(al2); System.out.println(y);
 */
