package com.bytecode.collection.comp;

import java.util.Comparator;

import com.bytecode.collection.Kutta;

public class MyComparator implements Comparator<Kutta>{

	@Override
	public int compare(Kutta o1, Kutta o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
