package com.itm.collection;

import java.util.Comparator;

import com.itm.collection.entity.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.geteName().compareTo(o2.geteName());
	}

}
