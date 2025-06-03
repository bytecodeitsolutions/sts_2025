class Customer
{
	static int  id;
	String name;
	
	static int  getCustomerId(){
		return id;
	}
	static String getCustomerName(){
		Customer  c1=new Customer();
		return c1.name;
	}
	Customer getCustomer(){
		Customer  x=new Customer();
		x.id=101;
		x.name="Kayum";
		
		System.out.println(x.id);
		System.out.println(x.name);
		
		return x;
	} 
}
class ReturnTypeDemo4 
{
	public static void main(String[] args) 
	{
		Customer  obj=new Customer();
		obj.name="Rani";
		Customer  y=obj.getCustomer();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(y.id);
		System.out.println(y.name);
		
	}
}
