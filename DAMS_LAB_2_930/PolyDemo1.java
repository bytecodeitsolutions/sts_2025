/*
  Polymorphism:
  -------------
  poly :- many
  morphism:- forms
  
  many forms
  
  same name different forms
  same name different behaviour
  
  **************************************************
  
  Compiletime ==>compiler ==>early binding ==>static poly===>refernce
    |-Overloading
	|-Method Hiding
  Runtime    ===>JVM ===>late binding ===>dynamic poly==>object
    |-Overriding
  
  
  
   |-Overloading:
   ==============
   
   Why???
   
   type
   number of argument
   order of argument
   
   
   class Test{
      void  m1(int  a, float  b){
	  
	  }
	  
	  void  m1(float  b,int  a){
	  
	  }
   }
   
*/

class EmployeeLoginSystem
{
	void login(String email,String pass){
		
	}
	
	void login(long mobileNumber){
		
	}
	
	void login(String  userName, long adharNumber, Date dob){
		
	}
}
class  PolyDemo1
{
	public static void main(String[] args) 
	{
		
	}
}
