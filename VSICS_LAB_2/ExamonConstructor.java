class Customer
{
	int  cId;
	String name;
	String address;
	long phone;
	double totalAmount;
	
	Customer(int cId,String name,String address,long phone,double totalAmount){
		this.cId=cId;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.totalAmount=totalAmount;
	}
	
	Customer  getCustomerDetails(Customer  obj){
		return obj;
	}
	
	double getAmount(){
		return totalAmount;
	}
	
}

class ShopKeeper
{
	
	Customer  obj;
	
	ShopKeeper(Customer  obj){
		this.obj=obj;
	}
	
	void getCustomerData(Customer  x){
		Customer  y=x.getCustomerDetails(x);
		System.out.println(y.cId);
		System.out.println(y.name);
		System.out.println(y.address);
		System.out.println(y.phone);
		System.out.println(y.totalAmount);
		
	}
	 
	void getOfferEligibility(){
		double amt=obj.getAmount();
		
		if (amt>=5000.0)
		{
			System.out.println(obj.name +" you are eligible for offer");
		}
		else{
			System.out.println(obj.name +" you are not  eligible for offer");
		}
		
	}
	
}
class  ExamonConstructor
{
	public static void main(String[] args) 
	{
		Customer c1=new Customer(1011,"Kayum","Kanpur",83744759L,1000.0);
		ShopKeeper  sk=new ShopKeeper(c1);
		
		sk.getCustomerData(c1);
		sk.getOfferEligibility();
		
	}
}
