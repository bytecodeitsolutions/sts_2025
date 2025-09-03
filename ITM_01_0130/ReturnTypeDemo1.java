class Customer
{
	int  customerId;
	String customerName;
	String address;
	Account  account;
    
	Customer(Account  account){ //we will learn by tomorrow
		this.account=account;
	}
	
	Account getAccount(){
		return account;
	}
	
	Customer  getCustomerDetails(Customer  c1){
		
		return  c1;
		
	}
}
class Account
{
	int  accountId;
	long accountNumber;
	float  balance;
	Account  a1;
	
	void setAccount(Account  a1){
		this.a1=a1;
	}
	
	Account  getAccount(){
		return  a1;
	}
}
class ReturnTypeDemo1 
{
	public static void main(String[] args) 
	{
		Account  a1=new Account();
		a1.accountId=1111;
	    a1.accountNumber=12345;
	    a1.balance=1000;
		Customer  c1=new Customer(a1);
		c1.customerId=1011;
		c1.customerName="Raja";
		c1.address="Gwalior";
		Customer  c2=c1.getCustomerDetails(c1);
		System.out.println(c2.customerId);
		System.out.println(c2.customerName);
		System.out.println(c2.address);
		Account  a2=c2.getAccount();
		System.out.println(a2.accountId);
		System.out.println(a2.accountNumber);
		System.out.println(a2.balance);
	}
}
