package com.itm.beans;

class SingletonTest{
	
	private static SingletonTest singletonTest;
	private SingletonTest() {
		
	}
	
	public static SingletonTest getObject() {
		
		if (singletonTest==null) {
			singletonTest=new SingletonTest();
		}
		return singletonTest;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		//SingletonTest  t1=new SingletonTest();
		SingletonTest  obj1=SingletonTest.getObject();
		SingletonTest  obj2=SingletonTest.getObject();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
