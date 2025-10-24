package com.itm;

@FunctionalInterface
interface Inter1{
	public int sum(int  a,int  b);
}
//working with normal interface===arrange marriage
//1. class bnao 
//2. implements
//3. method override
//4. method parameter with data type
//5. must return
//6. logic 

//functional interface with lambda===>court marriage==love marriage
//ki sirf logic define kro

//functional interface with method reference===dusre ki wife apni wife

public class TestingNormalInterface {

	public static void main(String[] args) {
		X  x1=new X();
		
		Inter1 obj=x1::xyz;
		
        System.out.println(obj.sum(10, 20));
	}

}

class Demo{
	public static int m1(int  x,int  y) {
		return x+y;
	}
}

class X{
	public int  xyz(int  a,int  b) {
		return a+b+a+b;
	}
}
