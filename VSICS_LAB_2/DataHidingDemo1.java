//why????????????????????????????????????????????????????????
//method---????????????????????

class Account
{
	private long accountNumber;
	private double balance; //validation-logic
	
	Account(long accountNumber){
		this.accountNumber=accountNumber;
	}
	
	//encapsulation
	void setBalance(double balance){
		this.balance=balance;
	}
	
	long getAccountNumber(){
		return accountNumber;
	}
	
	
	double  getBalance(){
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.println("Please enter your pin");
		int  pin=s1.nextInt();
		boolean flag=Pin.checkPin(pin);
		if (flag==true)
		{
			return balance;
		}else{
			return -1;
		}
		
	}
	
	
}

class Pin
{
	static boolean checkPin(int  pin){
		if (pin==1111)
		{
			return true;
		}
		else if (pin==2222)
		{
			return true;
		}
		else{
			return false;
		}
	}
}

class Customer
{
	private String customerName;
	
	Account  account;
	
	Customer(Account  account){
		this.account=account;
	}
	
	void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	void checkBalance(){
		double bal=account.getBalance();
		if (bal==-1)
		{
			System.out.println(customerName +" your pin is invalid");
		}
		else{
		    System.out.println(customerName +" available balance is ="+ bal+" in your account is::"+account.getAccountNumber());
		}
	}
}

class  DataHidingDemo1
{
	public static void main(String[] args) 
	{
		Account  account1=new Account(111222L);
		Account  account2=new Account(111333L);
		
		account1.setBalance(10000.0);
		account2.setBalance(20000.0);
		
		Customer  c1=new Customer(account1);
		c1.setCustomerName("Raja");
		
		Customer  c2=new Customer(account2);
		c2.setCustomerName("Rani");
		
		c1.checkBalance();
		c2.checkBalance();
		
	}
}
