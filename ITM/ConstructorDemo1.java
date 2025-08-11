/*
   Why Constructor?
   Rules to define constructor?
   Default constructor
   this()
   super()
   this
   
   super ::
   -------
   constructor chaining
   constructor overloading
  
   
 
 
 
class Employee
{
	private int x;
	private String y;
	
	Employee(int empId,String empName){
		this.x=this.empId;
		this.y=this.empName;
	}
	
	void printEmpData(){
		System.out.println("Id="+x);
		System.out.println("Name="+y);
	}
}
   
   ======================================
   class
     |-variables
	     |-static
		 |-non static 
		 |-local
	 |-method
	   |-parameters
	         |-primitive
			      |-byte , short,int , long , float , double , boolean ,char
				  
			 |-non primitive
			     |-class-Animal , Student , Chair .....
	  |-Return Type
	      |-primitive
			      |-byte , short,int , long , float , double , boolean ,char
				  
			 |-non primitive
			     |-class-Animal , Student , Chair .....
	  Type
	     |-static ==>ClassName
		 |-non static method==>object creation
		 
	   
		=======================================================
		Constructor:
		------------
		  why constructor-
		  if we want to initialize the data "at the time of object creation" so that object can behave properly then we should define constructor within class.
		  
		  ********************************************************
		  Rules to define java constructor
		  1. name of class and name of constructor must be same
		  2. declaration same as method but we can not take return type
		    if we are taking return type with constructor????
			    
		  3.		-that constructor will work as a method 
				  but we will not any CE or RE.
		  thatwhy its not a good programming practice to take return type with any constructor.
		  
		  4. execution=?
		     at the time object creation constructor will be executed.
			
*/
class ConstructorTest1
{
	static int  a;
	 ConstructorTest1(){
		 a++;
		 System.out.println(a +" zero param constructor "+hashCode());
	 }
	
}
class ConstructorDemo1 
{
	public static void main(String[] args) 
	{
		ConstructorTest1 obj1=new ConstructorTest1();
		ConstructorTest1 obj=new ConstructorTest1();
		
	}
}
