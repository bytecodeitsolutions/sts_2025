//this  super
//this() super()
class Account
{
	long accountNumber;
	double balance;
	
	//Account(){}
	
	Account(long accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	void getAcountData(){
		System.out.println(accountNumber);
		System.out.println(balance);
	}
}
class Customer extends Account
{
	String customerId;
	String customerName;
	
	Customer(String customerId,String customerName,long accountNumber,double balance){
		super(accountNumber,balance);
		this.customerId=customerId;
		this.customerName=customerName;
	}
	
	void getCustomerData(){
		System.out.println(customerId);
		System.out.println(customerName);
	}
}
class  ThisSuperDemo1
{
	public static void main(String[] args) 
	{
		Customer  c1=new Customer("1001","Raja",111222L,10000.0D);
		c1.getCustomerData();
		c1.getAcountData();
	}
}
