class Product
{
	int pId;
	String pName;
	double pPrice;
}
class Customer
{
	String userName;
	String password;
	String address;
	int cusId;
	long phone;
	String email;
	
	void  checkProduct(Product  product){
		System.out.println(product.pId +"  :: " +product.pName +" :: "+product.pPrice);
	}
	void isValid(Customer  customer){
		System.out.println("Checking data in database that user is valid or not");
		System.out.println(customer.userName);
		System.out.println(customer.password);
		System.out.println(customer.address);
		System.out.println(customer.email);
		System.out.println(customer.cusId);
		System.out.println(customer.phone);
		if (customer.userName.equals("raja") && customer.password.equals("rani"))
		{
			System.out.println(customer.userName +" is valid user go to profile page");
		}
		else{
			System.out.println(customer.userName+" is not  valid user ,try with correct user and password");
		}
	}
}
class CustomerLogin
{
	void login(Customer c1){
		System.out.println("data gathered ate server side and passed to db");
		c1.isValid(c1);
		
	}
	
	void logout(Customer c1){
		System.out.println(c1.userName +" logged out successfully");
	}
}
class  MethodParameterDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("Webpage- inserted data");
		CustomerLogin obj=new CustomerLogin();
		
		Customer  botal=new Customer();
		Customer  c2=new Customer();
		c2.userName="rani";
		
		botal.userName="raja";
		botal.password="rani";
		botal.email="raja@rani.com";
		botal.phone=3645374L;
		botal.cusId=111;
		botal.address="Saket Nagar";
		
		obj.login(botal);
		obj.logout(botal);
		obj.logout(c2);
		Product p1=new Product();
		p1.pId=1011;
		p1.pName="laptop";
		p1.pPrice=40000.0;
		
		botal.checkProduct(p1);
	}
}
