class WhyVariable
{
	public static void main(String[]  args){
		Student  s1=new Student();
		System.out.println("s1 student name ="+s1.studentName);
	
	}
}

class Student
{
	String studentName;
	static String collegeName;
}

class Customer
{
}

/*
    Types of variables:
	-------------------
	Primitive Variables==byte , short , int , long , float , double, boolean , char
	
	String---->
	
	Non Primitive variables  ==>object
	
	int  rno;
	String  name;
	College c;
	Student  s1;
	Student  obj;
	double  totalFee;
	boolean flag;
	int[]  rollNumbers;
	
	
	=============================
	Based on purpose and posotion:
	------------------------------
	
	static variable
	-------------------
	
	static datatype  variablename;
	-------------------------------
	non static variable
	
	   datatype  variablename;
	   
	   ---------------------------------
	local variable 
	
	=================================
	
	class Car{
		
	   static String brandName;//static==Class
	   int  carId;//non static (instance=object)
	   
	   void  start(int  speed){
	      String  fuelType;
		  if(true){
			  int  a;  //variable speed , fuelType and a are local variables.
		  }
	   }
	   
	}
*/