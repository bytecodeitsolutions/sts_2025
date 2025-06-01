/*
   Type of variables:
   ------------------
   Purpose and position:
   ====================
   1) static variable
   2) non static variable
   3) local variable
   
   
   --------------------
   Primitive variable
   Non primitive variable
   
*/

class  VariableDemo1
{
	//data=====what is datatype , why datatype , type of datatype
	           //variable --why , type of variable , how to variable
			   //reserved word
			   //literals
			   //Identifier
	//method
	    //datatype | returntype 
		//identifier
		//variable | parameters
		//reserevd words
}

class Test
{
	int   a;    //heap area --->seperate --->number of object---->obj_reference
	
	            //Test  obj=new Test(); (obj.a)
				
	static  int  b; //method area --common ---only once--class loading---->
	             //ClassName (Test.b) | obj.b | b (within same class)
		int   c; 
		int  d;
	void  sum(){
		               //obj.sum();
		  //local --------------stack memory
	}
	
	static void multiply(){ //d is a local variable
		
	  //Test.multiply();  | obj.multiply() | multiply() (only within same class)
	  
	}
	
	void  div(){
		int e=c/d;
		int f=a/b;
	}
	
}
