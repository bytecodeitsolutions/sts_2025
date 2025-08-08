/*
   Why method?
   syntax for methods?
   How to call method
      |-static method==>method area==>only once==>ClassName
	  |-non static method==>heap Area ==>object creation===>object reference variable
	  
	  
	  static 
	  non static
	  
	  -------------
	  parameterized 
	  non parameterized
	  ------------------
	  
	  void return type
	  non void return type
	  
	  ---------------------
	  predefined method
	  user defined method
	  ---------------------
*/

class Demo
{
	void  m1(){
		System.out.println("non static method==>object reference variable se");
	}
	
	static void m2(){
		System.out.println("static method==>classname se");
	}
}
class  MethodType
{
	public static void main(String[] args) 
	{
		double  value=Math.sqrt(9.0);
		System.out.println(value);
		
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int  a=s1.nextInt();
		System.out.println("square of "+a +" is equal to ="+(a*a));
	}
}
