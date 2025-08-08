/*
class Account
{
	double balance;
	String name;
	long accountNumber;
	Account getAccountDetails(String cusName,long accNumber,double bal)
	{
		Account  a1=new Account();
		System.out.println("address of a1 within getAccountDetails="+a1.hashCode());
		a1.balance=bal;
		a1.name=cusName;
		a1.accountNumber=accNumber;
		return a1;
	}
}
class Customer 
{
	public static void main(String[] args) 
	{
		Account  a1=new Account();
		Account  a2=new Account();
		System.out.println("address of a1 within main="+a1.hashCode());
		
		Account s=a1.getAccountDetails("Raja",112233L,10000.0);
		System.out.println(s.balance);
		System.out.println(s.name);
		System.out.println(s.accountNumber);
		
		Account a=a2.getAccountDetails("Rani",112244L,20000.0);
		a2.balance=5000.0;
		a2.name="Raju";
		a2.accountNumber=445566L;
		
		System.out.println(a.balance);
		System.out.println(a.name);
		System.out.println(a.accountNumber);
		
		System.out.println(a2.balance);
		System.out.println(a2.name);
		System.out.println(a2.accountNumber);
		
	}
}


   
	 data types:
	   |-primitve data type
	        |-numeric data type
			    |-integral data type (10,20,30,)
				     |-byte  =1 Byte= 8 bits
					 |-short =2 Byte=16 bits
					 |-int   =4 Byte=32 bits===>default
					 |-long  =8 Byte=64 bits
				|-floating point data type
				     |-float = 4 Byte
					 |-double =8 Byte====>double
			|-non numeric data type
			         |-boolean== 1 Byte [true , false]
					 |-char  === 2 Byte =16 bits==0 to 65535 
					 
	   |-non primitive data type (object=>new ==>memory 
	   allocation==>variable +methods)
	        |-class (Account)
			|-interface
			|-enum
			|-array
			
			Non primitive:
			--------------
			class
			
			
	     
*/

class Engine
{
	void  start(){
		System.out.println("Engine started...");
	}
}
class Car
{
	String  carName;
	float   carPrice;
	int  carId;
	
	void  displayCarData(Car  obj){
		System.out.println(obj.carName);
		System.out.println(obj.carPrice);
		System.out.println(obj.carId);
	}
	
	void move(Engine  e1){
		e1.start();
		System.out.println("Car is moving-Happy Journey");
	}
}
class Customer
{
	public static void  main(String[]  args){
	  Car  c1=new Car();
	  c1.carId=1111;
	  c1.carPrice=300000.0f;
	  c1.carName="Innova Crysta";
	  c1.displayCarData(c1);
	  Engine  eng1=new Engine();
	  c1.move(eng1);
	}
}