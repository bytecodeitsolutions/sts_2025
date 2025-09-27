/*
    
*/
class Account
{
	private double balance;//data hiding
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){//setter
		this.balance=balance;
	}
	
}
class GPay
{
	void getBalance(){
		Account  a1=new Account();
		//a1.balance=100;
		a1.setBalance(1000);//setter
		double d=a1.getBal();
		System.out.println("balance="+d);
	}
}
class  DataHidingDemo1
{
	public static void main(String[] args) 
	{
		GPay  p=new GPay();
		p.getBalance();
	}
}
