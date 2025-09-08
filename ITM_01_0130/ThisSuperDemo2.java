abstract class Customer
{
	String address;
	long mobileNumber;
	String customerName;
	
	Customer(String address,long mobileNumber,String customerName){
		this.address=address;
		this.customerName=customerName;
		this.mobileNumber=mobileNumber;
	}
	void getData(){
		System.out.println(customerName);
		System.out.println(mobileNumber);
		System.out.println(address);
	}
	
}
class Account extends Customer
{
	
	Account(){
		super("Gwalior",1234L,"Rani");
	}
}
class  ThisSuperDemo2
{
	public static void main(String[] args) 
	{
		//Customer  c1=new Customer("Gwalior",1234L,"Rani");
		Account a1=new Account();
		a1.getData();
	}
}
