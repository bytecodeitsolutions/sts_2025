/*
   Why Methods:
   
   How to define:
   
   Syntax:
   
   returntype  methodName(){
   
   }
   
   ----------------------------
   returntype---? void 
   methodname--->run , sleep , walk , login , logout , register , forgotpassword
   
   -----------------------------------------------------------------------------
   
   Memory:
   
   static method 
   ----------------
   it gets memory only once , at the time of class loading
   method area within JVM at the part of class
   we can access static method in 3 ways
      |-ClassName
	  |-obj_ref
	  |-direct (within same class)
	  
	  
   
   
   non static method:
   ==================
   it gets memory , once we create the object means it depends on object creation.
   for ex if we create 10 objects then non   static method will the get memory 
   10 times.
   
   within heap area as the part of object.
   we can access non static method using object_reference.
   
   -------------------------------------------------------------------------------
   
   **********************************************************************************
   
   
   parameter:
   -----------
   
   with parameter method:
      Why parameter????? in software development.
	  
   without parameter method:
*/
class  MethodParameterDemo1
{
	static void  sum(boolean  x){
		System.out.println("method without parameter ::"+x);
	}
	
	void  mul(int  a, int  b,String  s){
		System.out.println("method with 2 parameter ::"+(a*b));
	}
	
	public static void main(String[] args) 
	{
		MethodParameterDemo1.sum(false);
		MethodParameterDemo1  obj=new MethodParameterDemo1();
		obj.mul(10,2,"java");
		
	}
}
