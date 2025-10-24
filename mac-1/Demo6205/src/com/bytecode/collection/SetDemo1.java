package com.bytecode.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.bytecode.collection.comp.MyComparator;

public class SetDemo1 {

	public static void main(String[] args) {
		
		//Comparator<Kutta> comparator=(x1,x2)->{ return x1.getAge()-x2.getAge();};
		
		TreeSet<Kutta> hashSet = new TreeSet<Kutta>((x1,x2)->{ return (int) (x1.getPrice()-x2.getPrice());});
		Kutta k1 = new Kutta(4, "doggy1", 1000.0);
		Kutta k2 = new Kutta(1, "moggy2", 2000.0);
		Kutta k3 = new Kutta(7, "boggy1", 9000.0);
		Kutta k4 = new Kutta(10, "jobby1", 7000.0);
		Kutta k5 = new Kutta(2, "koggy1", 10000.0);
		Kutta k6 = new Kutta(2, "moggy1", 10000.0);

		hashSet.add(k1);
		hashSet.add(k2);
		hashSet.add(k3);
		hashSet.add(k4);
		hashSet.add(k5);
		hashSet.add(k6);
		System.out.println(hashSet);
	}

}
/*
 * 
 * HashSet<Kutta> kuttas=new HashSet<Kutta>();
 * 
 * 
 * Kutta k6=new Kutta(4, "doggy1", 1000.0); Kutta k7=k2;
 * 
 * kuttas.add(k1); kuttas.add(k2); kuttas.add(k3); kuttas.add(k4);
 * kuttas.add(k5); kuttas.add(k6); kuttas.add(k7); System.out.println(kuttas);
 * 
 * //Account-1- new Account(Raja 123 10001)==>100000 | 100000==>Account-2--new
 * Account(Raja 123 10001)
 * 
 */
