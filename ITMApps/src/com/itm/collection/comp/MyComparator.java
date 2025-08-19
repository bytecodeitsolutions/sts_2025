package com.itm.collection.comp;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
