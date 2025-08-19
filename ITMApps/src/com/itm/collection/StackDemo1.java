package com.itm.collection;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> integers=new Stack<Integer>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(1);
		
		System.out.println(integers);
		System.out.println(integers.search(100));;

	}

}
