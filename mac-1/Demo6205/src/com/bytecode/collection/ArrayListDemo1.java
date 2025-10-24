package com.bytecode.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		/*
		 * al1.add(10); al1.add(20); al1.add(10); al1.add(100); al1.add(20000);
		 * ArrayList al=new ArrayList(); al.add(10); al.add(20); al.add(10);
		 * al.add(100); al.add("java"); System.out.println(al);
		 */
		/*
		 * al.add(2, 200); System.out.println(al); al.addFirst(1); al.addLast(2);
		 * System.out.println(al); al.addAll(al); System.out.println(al); al.addAll(10,
		 * al); System.out.println(al); System.out.println(al.contains(1000));
		 * System.out.println(al.containsAll(al1));
		 */
		
	//	al.forEach(a->System.out.println(a));//lambda

	//	al.forEach(System.out::println);//method reference
		
	/*
	 * System.out.println(al.get(0)); System.out.println(al.getLast());
	 * 
	 * System.out.println(al.remove(0)); System.out.println(al.removeAll(al));
	 * System.out.println(al); al.add(10); System.out.println(al.isEmpty());
	 */
		ArrayList<Kutta> al=new ArrayList<Kutta>();
		al.add(new Kutta(1, "Shepherd", 10000.0));
		al.add(new Kutta(3, "ABC", 8000.0));
		al.add(new Kutta(2, "XYZ", 60000.0));
		al.add(new Kutta(10, "PQR", 7000.0));
		al.add(new Kutta(7, "Pilla", 100.0));
		
		//System.out.println(al);
		
		al.forEach(System.out::println);
		
		al.stream().filter(x->x.getAge()==7).forEach(System.out::println);
	}

}
