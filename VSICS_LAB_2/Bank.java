//with parameter
//without parameter

class Customer
{
	String name;
	int id;
	String address;
	long mob;
	String email;
	String pan;
	long adhar;
	
}
class Bank 
{
	static String bankName;
	
	static void getBankDetails(Customer  c){
	
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.address);
		System.out.println(c.pan);
		
	}
	
	static void  getAddress(String address){
		System.out.println(address);
	}
	public static void main(String[] args) 
	{
		Bank.bankName="Apna Bank";
		Customer obj=new Customer();
		obj.name="Raja";
		obj.id=101;
		obj.address="saket";
		obj.pan="ABDBDG123";
		
		Bank.getBankDetails(obj);
		
	}
}
