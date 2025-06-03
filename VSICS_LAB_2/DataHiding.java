/*
  class
  object
  method
  variable
  
  =============
  syntax for class:
  ------------------------------------------
  class  ClassName{
  
  }
  ==========================================
  object syntax:
  ---------------
  ClassName  obj_ref_variable=new ClassName();
  
  ------------------------------------------
  Syntax for method:
  
  returntype  methodName(){
  
  }
  
  ============================================
  
  variable syntax:
  
  datatype  variableName;
  
  ==============================================
  
  
  
  
*/
class Account
{
	private long accountNumber;
	private double balance;
	
	public void setAccountNumber(long accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public long getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		boolean flag=CheckUser.checkUserUsingAccountNumber(accountNumber);
		if (flag==true)
		{
			return balance;
		}
		else{
			return -1;
		}
	}
	
}


class CheckUser
{
	static boolean  checkUserUsingAccountNumber(long  accountNumber){
		if (accountNumber==111222L)
		{
			return true;
		}
		else if (accountNumber==111333L)
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
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	
	void checkBalance(Account  a1){
		double  bal=a1.getBalance();
		if (bal==-1.0)
		{
			System.out.println("Invalid account number");
		}
		else{
		  System.out.println(name +" balance in your account ::"+a1.getAccountNumber() +" is="+bal);
		}
	}
}
class DataHiding 
{
	public static void main(String[] args) 
	{
		Account  a1=new Account();
		Account  a2=new Account();
		a1.setAccountNumber(111222L);
		a1.setBalance(10000.0);
		
		
		a2.setAccountNumber(111333L);
		a2.setBalance(20000.0);
		
		Customer  c1=new Customer();
		Customer  c2=new Customer();
		
		c1.setName("Kayum");
		c2.setName("Rani");
		c2.checkBalance(a2);
	}
}
