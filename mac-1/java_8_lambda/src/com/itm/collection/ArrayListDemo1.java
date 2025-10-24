package com.itm.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
        obj.add(10);
        obj.add(10);
        obj.add(null);
        obj.add(null);
        obj.add(true);
        obj.add("java");
        obj.add(10.6);
        
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add("python");
        
        obj.addAll(al);
        
        System.out.println(obj);
        obj.add(5, 1000);
        System.out.println(obj);
        obj.addFirst(2000);
        obj.addLast(3000);
        System.out.println(obj);
        
       System.out.println(obj.get(1));
       System.out.println(obj.getFirst());
       
       System.out.println(obj.contains(3000));
       System.out.println(obj.containsAll(al));
       
       System.out.println(obj.isEmpty());
       obj.clear();
       System.out.println(obj.isEmpty());
       System.out.println(obj);
       
       LinkedHashSet<Integer> t=new LinkedHashSet<Integer>();
       t.add(100);
       t.add(2);
       t.add(4);
       t.add(1000);
       t.add(4);
       t.add(1000);
       t.add(400);
       System.out.println(t);
	}

}
