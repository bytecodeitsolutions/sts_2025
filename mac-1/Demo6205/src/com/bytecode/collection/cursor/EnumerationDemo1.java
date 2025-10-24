package com.bytecode.collection.cursor;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EnumerationDemo1 {

	public static void main(String[] args) {
		List<String> arrayList=new CopyOnWriteArrayList<String>();
		arrayList.add("java");
		arrayList.add("python");
		arrayList.add("c");
		arrayList.add("php");
		arrayList.add("c++");
		
		System.out.println(arrayList);
		
		Iterator<String> iterator=arrayList.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			if (string.equals("java")) {
				arrayList.add("spring");
				
			}
			
		}
		System.out.println(arrayList);
	}

}
/*
 * Enumeration (I):- Vector | Stack ----
 * Enumeration elements()
 * 
 * Vector<Integer> integers = new Vector<Integer>();
		integers.add(10);
		integers.add(21);
		integers.add(30);
		integers.add(43);
		integers.add(50);

		System.out.println(integers);

		Enumeration<Integer> enumeration = integers.elements();
		
		while (enumeration.hasMoreElements()) {
			Integer integer = (Integer) enumeration.nextElement();
			
			if (integer%2==0) {
				System.out.println(integer);
			}
			
		}

 * ========================
 * Iterator:-
 *    |-With All Collections
 *    
 *    
 *     Iterator<Integer> iterator=arrayList.iterator();
		 
		 while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer%2!=0) {
				System.out.println(integer);
			}
			
		}
 * 
 * ==========================
 * ListIterator:-
 *    |-only for List class objects
 *    
 *    
 *    ListIterator<String> iterator=arrayList.listIterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			if (string.equals("java")) {
				iterator.remove();
			}
			else if(string.equals("php")) {
				iterator.set("laravel");
			}
			else if(string.equals("c")){
				iterator.add("native c");
			}
			
		}
		
		System.out.println(arrayList);
 *    
 *    ======================
 *    
 *    forEach():-
 *    
 *    arrayList.forEach(x->System.out.println(x));
		
		arrayList.forEach(System.out::println);
 * 
 */
