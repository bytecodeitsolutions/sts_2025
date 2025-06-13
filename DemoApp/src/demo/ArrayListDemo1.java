package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> al = new TreeSet();
		al.add(10);
		al.add(12);
		al.add(14);
		al.add(15);
		al.add(20);

		
		for (Integer object : al) {
			System.out.println(object);
		}
	}

}
