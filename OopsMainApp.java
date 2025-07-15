/*
   class
     |-data
	 |-methods
	 
   Object
	 |-access data
	 |-access methods
	 
*/

class Bank
{
	static String bankName="Bytecode bank";
	static String bankCode="BC101";
	
	static void showBankDetails(){
		System.out.println("Bank name is::"+bankName +" & bank code is::"+bankCode);
	}
}

class Customer
{
	private String customerName;
	private int customerId;
	private long mobileNumber;
	private long adharNumber;
	
	Customer(String customerName,int customerId,long mobileNumber,long adharNumber){
		this.customerName=customerName;
		this.customerId=customerId;
		this.mobileNumber=mobileNumber;
		this.adharNumber=adharNumber;
	}
	
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	public void setMobileNumber(long mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public void setAdharNumber(long adharNumber){
		this.adharNumber=adharNumber;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	public int getCustomerId(){
		return customerId;
	}
	public long getMobileNumber(){
		return mobileNumber;
	}
	public long getAdharNumber(){
		return adharNumber;
	}
	
	void showCustomerDetails(){
		Bank.showBankDetails();
		System.out.println("Customer Name::"+customerName);
		System.out.println("Customer Id::"+customerId);
		System.out.println("Customer Mobile Number::"+mobileNumber);
		System.out.println("Customer Adhar Number::"+adharNumber);
	}
	
}

class Account extends Customer
{
	 private int accountNumber;            
     private String accountType;             
     private double balance;   
	 
	 Account(int accountNumber,String accountType,double balance,String customerName,int customerId,long mobileNumber,long adharNumber){
		 super(customerName,customerId,mobileNumber,adharNumber);
		 this.accountNumber=accountNumber;
		 this.accountType=accountType;
		 this.balance=balance;
	 }
	 
	 void deposit(double damt){
		 balance=balance+damt;
	 }
	 void withdraw(double wamt){
		balance=balance-wamt;
	 }
	
	void checkBalance(){
		System.out.println("Balance in your account ::"+accountNumber +" is="+balance);
	}
	
	double getBalance(){
		return balance;
	}
}

class Card
{
	private long cardNumber;
	private java.util.Date date;
	
	Card(long cardNumber,java.util.Date date){
		this.cardNumber=cardNumber;
		this.date=date;
	}
	
	void showCardDetails() {
		System.out.println("Card Number is="+cardNumber);
		System.out.println("Card Expiry date is="+date);
	}
	
	public static void cardType(){
		System.out.println("This is Rupay card");
	}
}

class DebitCard extends Card
{
	private int cvv;
	
	DebitCard(long cardNumber,java.util.Date date,int cvv){
		super(cardNumber,date);
		this.cvv=cvv;
	}
	
	void showCardDetails() {
		super.showCardDetails();
		
		System.out.println("cvv is="+cvv);
	}

	public static void cardType(){
		System.out.println("This is Visa card");
	}
}

class ATM
{
	boolean validatePin(int  pin){
		return pin==1234;
	}
    void performTransaction(Account  account,double wamt){
		if (validatePin(1234))
		{
			if (wamt<=account.getBalance())
			{
				account.withdraw(wamt);
			}
			
		}
		
    } 
}

class OopsMainApp
{
	public static void main(String[]  args){
		Account  a1=new Account(1001,"saving",10000.0d,"Raja",101,9854756475L,111122223333L);
	    ATM  atm=new ATM();
		atm.performTransaction(a1,5000.0);
		a1.checkBalance();
		a1.showCustomerDetails();
		
		DebitCard  d1=new DebitCard(1122334455L,new java.util.Date(),173);
		d1.showCardDetails();
	}
}