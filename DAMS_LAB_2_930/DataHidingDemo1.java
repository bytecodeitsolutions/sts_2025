/*
   Object Oriented Programming 
   ---------------------------
   data hiding:
   ------------
   
   //Encapsulation
   
   //
   
   IS-A Relationship (Inheritance::)
   ----------------------------------
   
   extends
   
   
*/
class  Account
{
	 private long accountNumber;
	 private double balance;
	 
	 public  void setAccountNumber(long accountNumber){
		 //validation
		this.accountNumber=accountNumber;
	 }
	 
	 public void setBalance(double balance){
		this.balance=balance;
	 }
	 
	 public long getAccountNumber(){
		return accountNumber;
	 }
	 
	 public double getBalance(){
		 boolean  flag=Pin.checkPin(1111);
		 if (flag==true)
		 {
			 return balance;
		 }
		 else{
			return -1;
		 }
		
	 }
}

class Pin
{
	public static boolean checkPin(int  pin){
		if (pin==1112)
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
	private String  customerName;
	
	public void setCustomerName(String  customerName){
		this.customerName=customerName;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	
	void showBalance(Account  account){
		double  value=account.getBalance();
		if (value==-1.0)
		{
			System.out.println("Invalid pin");
		}
		else{
			System.out.println(getCustomerName() +" balance in your account ="+account.getAccountNumber() +"  is="+value);
		}
	}
}

class DataHidingDemo1
{
	public static void main(String[]  args){
		Customer  customer1=new Customer();
		Customer  customer2=new Customer();
		
	    customer1.setCustomerName("Raja");
		customer2.setCustomerName("Rani");
		
		Account   ac=new Account();
		ac.setAccountNumber(111222L);
		ac.setBalance(10000.0d);
		
		Account   ac1=new Account();
		ac1.setAccountNumber(111333L);
		ac1.setBalance(20000.0d);
		
		customer2.showBalance(ac1);
		customer1.showBalance(ac);
	}
}
