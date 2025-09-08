class BankCustomer
{
	String customerName;
	long adharNumber;
	String panNumber;
	long primaryNumber;
	long alternateNumber;
	String email;
	
	BankCustomer(String customerName,long adharNumber,String panNumber,long primaryNumber){
		this.customerName=customerName;
		this.adharNumber=adharNumber;
		this.panNumber=panNumber;
		this.primaryNumber=primaryNumber;
	}
	
	void getCustomerData(){
		System.out.println(customerName);
		System.out.println(adharNumber);
		System.out.println(panNumber);
		System.out.println(primaryNumber);
	}
}
class  WhyConsDemo2
{
	public static void main(String[] args) 
	{
		BankCustomer c1=new BankCustomer("Raja",1001L,"A123",724574L);
		BankCustomer c2=new BankCustomer("Rani",1002L,"A124");
		c1.getCustomerData();
		c2.getCustomerData();
	}
}
