package com.bytecode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionDemo1 {

	public static void main(String[] args) {
		//code nhi smjhna hai
		
		Collection  c1=new TreeSet();
		
		c1.add(10);
		c1.add(5);
		c1.add(100);
		c1.add(5);
		c1.add(100);
		c1.add(1);
		System.out.println(c1);

	}

}
