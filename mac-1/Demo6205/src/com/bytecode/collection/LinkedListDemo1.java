package com.bytecode.collection;

import java.util.LinkedList;

class User {
	int uid;
	String name;
	long mobile;

	public User(int uid, String name, long mobile) {
		this.uid = uid;
		this.name = name;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", mobile=" + mobile + "]";
	}
}

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<User> linkedList = new LinkedList<User>();
		User u1=new User(222, "Raj", 136436443L);
		linkedList.add(new User(111, "Raja", 136436443L));
		linkedList.add(u1);
		linkedList.add(new User(333, "Raju", 136436443L));
		linkedList.add(new User(444, "Raj Kumar", 136436443L));
		linkedList.add(new User(555, "Rajan", 136436443L));
		System.out.println(linkedList);
		System.out.println(linkedList.get(1));
		linkedList.remove(u1);
		
		System.out.println(linkedList);//whole object
		
		linkedList.forEach(System.out::print);//iteration
		
		linkedList.removeAll(linkedList);
		
		System.out.println(linkedList);
	
	}

}
