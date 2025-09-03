/*
   Types of variables:
   -------------------
   static variable--->classloading-->single memory-->classname->object_reference
   non static ------->seperate memory--->object--object_reference
   
   local variable:
   ---------------
   1. why 
   2. within method/block/constructor / as a parameter
   3.
*/

class  LocalVariableDemo2
{
	static int  b=20;
	int  a=10;
	static void  m1(){
		int  c=30;
		System.out.println("within m1 c="+c);
	}
	static void  m2(){
		int a=1;
		int b=2;
		int c=3;
		LocalVariableDemo2  obj=new LocalVariableDemo2();
		System.out.println(" within m2 a="+obj.a+"b= "+b+"c= "+c);
	}
	public static void main(String[] args) 
	{
		m1();
		m2();
	}
}
