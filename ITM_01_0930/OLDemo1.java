/*
   Polymorphism:
   -------------
    same name different behaviour
	------------------------------
	why??
	Compiletime poly===>Compiler==>reference==>early binding==>static poly
	   |-Overloading
	   |-Method Hiding
	Runtime Poly===>JVM====>Object==>dynamic ==>late binding
	   |-Overriding
	   
	   ==================================================
	   Overloading:
	   -----------
	   In C:-
	      sum(int  a,int  b)
	      sum(float  a,float  b) not allowed
	  In Java:
	     sum(int  a,int  b)
	     sum(float  a,float  b) allowed
		type of parameter: 
		   m1(int  a)
		   m1(float f)
		no of parameter:
		   m1(int  a,int  b)
		   m1(float f)
		order of argument:
		   m1(int  a,float  b)
		   m1(float a,int  b)
		   
		   ===============================
		   
		   Case-1:
	       Automatic promotions in overloading (primitive)
		   
		   byte--->short-->int--->long--->float--->double
		           char--->int
				   
		  Case-2: (non primitive with parent child relation)
		  
		  Case-3: (non primitive without inheritance)
		  
		  Case-4: overloading with respect to var-arg method
		  
		  Case-5: 
		  
		  Case-6:
		  
		  
		  Overriding:
		  -----------
		    why????
		  
		  
	   
	   
*/

class Parent
{
	void marry(){
		System.out.println("marry according to parent");
	}
	void smoke(){
		System.out.println("dont smoke");
	}
}
class Child extends Parent
{
	void marry(){
		System.out.println("I will marry acc to me");
	}
}

class Child1 extends Parent
{
	void smoke(){
		System.out.println("i will go with cigar");
	}
}

class OLDemo1 
{
	public static void main(String... args) 
	{
		Child  c1=new Child();
		Child1  c2=new Child1();
		
		c1.marry();
		c1.smoke();
		c2.marry();
		c2.smoke();
	}
}
