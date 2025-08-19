package com.itm.collection.comp;

import java.util.Comparator;
import java.util.TreeSet;

public class CustComparatorDemo1 {

	public static void main(String[] args) {
		/*
		 * Comparator<Employee> comparator=new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o1.getEmpId()-o2.getEmpId(); } };
		 */
		
	    Comparator<Employee> c1=(x1,x2)->{ return x1.getEmpName().compareTo(x2.getEmpName());  };
	       	
		TreeSet<Employee> employees=new TreeSet<Employee>(c1);
		Employee e1=new Employee(111, "A", 21);
		Employee e2=new Employee(11, "Y", 18);
		Employee e3=new Employee(11, "X", 32);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println(employees);

	}

}
