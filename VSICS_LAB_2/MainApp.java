/*
   Types of variable
   ------------------
   1) primitive variable
         |-byte
		 |-short
		 |-int
		 |-long
		 
		 |-float
		 |-double
		 
		 |-boolean
		 |-char
		 
   2) non primitive variable
   
           Customer
		   Student
		   Laptop
		   User
		   Keyboard
		   Mouse
		   Desktop
   
   a) static variable
         1) primitive variable     int
         2) non primitive variable  Customer
   b) non static variable
          1) primitive variable     int
          2) non primitive variable  Customer
   c) local variable
           1) primitive variable      int
           2) non primitive variable   Customer
*/

class Customer
{
	static String shopName;
	static String shopAddress;
	
	String customerName;
	int   customerId;
	
	void  getCustomerData(){
		System.out.println("Shop Name is="+shopName +" Shop address is="+shopAddress);
	    System.out.println("Customer Name is="+customerName +" Customer id is="+customerId);
	}
	
}
class  MainApp
{
	public static void main(String[] args) 
	{
		Customer  c1=new Customer();
		Customer  c2=new Customer();
		Customer  c3=new Customer();
		
		//c1.shopName="ABC Shop";
		//c1.shopAddress="Saket Nagar";
		c1.customerName="Raja";
		c1.customerId=101;
		
		c1.getCustomerData();
		c2.getCustomerData();
		c3.getCustomerData();
	}
}
