/*
class=design
  data=properties
  method=functionalities
  
 
  
    Types of variables:
	-------------------
	  Based on purpose and position:
	  ---------------------------------
	  There are 3 types of variables.
	  1) static variable
	  2) non static variable
	  3) local variable
	  
	  datatype variableName;
	  String   companyName;
	  1. static variable:
	  -------------------
	  a) Why?
	  b) where to define/declare?
	     always within class and outside of any 
		 method
		 block
		 constructor
		 with static keyword.
	 c)  when it gets the memory??? =>at the time of class loading
	 d)  classes load only once within method area as the part of JVM thatswhy static variable will get the memory only once within method area.
	 
	 static variable-single copy
	 
	 e) how many ways?
	    we can acces static variable by 3 ways
		
		1.1=> by using classname
		
		ClassName.variable
		Employee.companyName
		1.2 =>by using object reference
		   Employee e1=new Employee();
		   e1.companyName
		1.3=>direct (only within the same class)
		    companyName
		 
	f) if we are not initializing static variable then jvm can
	initialize default value.
	
	byte
	short
	int    =0
	long 
	
	float
	double =0.0
	
	char=  space
	
	boolean= false
	
	Hathi , Kutta , Student , Laptop , String =null
	
	g) 
	
	######################################################
	
	2) Non static variable (instance variable)[Object]
	===================================================
	a). why???
	if the value of a variable is varied (changing) from object to object then we should define (declare) that variable as
	non static variable.
	
	 b) where to define/declare?
	     always within class and outside of any 
		 method
		 block
		 constructor
		 without static keyword.
		 
		 for ex:
		 String employeeName;
	     int employeeId;
	     double salary;
		 
		 are non static variables.
	  
	  c) by when it gets the memory
	    at the time of object creation
		
	  d) seperate copy
	  
	  e) how to access ns variable?
	     by using object reference
		 
	  f) if we are not initializing any value to ns variable then JVM can initialize default value.
	  
	  g) object level variable
	  
	  =====================================================
	  
	  local variable:
	  ================
	  why?
	  1. only for temporary requirement.
	  2. where to define
	      within 
		  method
		  block
		  constructor 
		  and as parameter
		  
	  3. where it gets memory?
	     stack area
		 
	 4. by when it gets memory
	     at the method / block / constructor execution
		 
	 5. how can we access?
	    direct
		
	 6. if we are not initializing the value of a variable??
	 
	 7. we can take local variable as final
	 
	 8. stack level variable
	 
	    
		  
	  
	  
*/
class Employee
{
	static String   companyName;
	static String companyAddress;
	static int companyId;
	static long companyTollFreeNumber;
	String employeeName;
	int employeeId;
	double salary;
	
	void getData(){
		System.out.println(companyName);
		System.out.println(Employee.companyName);
		Employee e1=new Employee();
		System.out.println(e1.companyName);
	}
}

class Kutta
{
	
}

class  VariableDemo2
{
	static VariableDemo2 obj;
	static int           obj1;
	static String        obj2;
	static boolean       obj3;
	static Kutta         obj4;
	public static void main(String[] args) 
	{
		System.out.println(obj);
		System.out.println(obj4);
		System.out.println(obj2);
	}
}
