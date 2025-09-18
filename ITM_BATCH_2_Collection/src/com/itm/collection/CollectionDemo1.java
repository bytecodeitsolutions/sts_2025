package com.itm.collection;

import java.util.Map;
import java.util.TreeMap;

public class CollectionDemo1 {

	public static void main(String[] args) {
		/*
		 * Comparator<Employee> c1 = (e1, e2) -> e2.geteName().compareTo(e1.geteName());
		 * 
		 * Comparator<Employee> c2 = new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee e1, Employee e2) {
		 * 
		 * return e2.geteName().compareTo(e1.geteName()); } };
		 * 
		 * TreeSet<Employee> hashSet = new TreeSet<Employee>(c2); Employee e1 = new
		 * Employee(191, "abc", 1000.0f, 35); Employee e2 = new Employee(101, "xyz",
		 * 2030.0f, 30); Employee e3 = new Employee(91, "rst", 10000.0f, 25); Employee
		 * e4 = new Employee(137, "pqr", 4000.0f, 60); Employee e5 = new Employee(1,
		 * "acd", 2003.0f, 35); hashSet.add(e1); hashSet.add(e2); hashSet.add(e3);
		 * hashSet.add(e4); hashSet.add(e5);
		 * 
		 * System.out.println(hashSet);
		 */

		Map<Integer, String> hashMap = new TreeMap<Integer, String>();
		hashMap.put(1, "Raju");
		hashMap.put(1000, "Raja");
		hashMap.put(50, "Ramesh");
		hashMap.put(201, "Raju");
		hashMap.put(101, "Raja");
		hashMap.put(101, "Ramesh");
		hashMap.put(102, "Ramesh");
		System.out.println(hashMap);
	}

}
