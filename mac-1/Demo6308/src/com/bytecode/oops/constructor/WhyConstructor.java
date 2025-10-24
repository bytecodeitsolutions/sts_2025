package com.bytecode.oops.constructor;


class Student{
	
	Student() {
		System.out.println("This is a zero param constructor");
	}
	
	void m1() {
		System.out.println("m1 method");
	}
	
}
public class WhyConstructor {

	public static void main(String[] args) {
		System.out.println("hello main");
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();

	}

}


/*  class ClassName{
 * 
 *   }
 *   
 *   datatype  varName;
 *   
 *   ====================
 * 
 * Why Constructor:-
 * if we want to initialize data at the time of object creation so that object can behave
 * properly then we should go for constructor.
 * 
 * How can we define a java constructor:
 * -------------------------------------
 * 1. classname and constructor name must be same.
 * 2. constructor executes at the time of object creation.
 * 
 * ClassName(){
 * 
 * 
 * }
 * 
 * class  Kutta{
 *    
 *    Kutta(){
 *    
 *    }
 * 
 * }
 * 
 * 
 * class Laptop{
 * 
 *     Laptop(int   a){
 *     
 *     }
 *     
 *     Laptop(String  s,double  d){
 *     
 *     }
 * }
 * */
 