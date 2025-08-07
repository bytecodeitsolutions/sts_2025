/*
   Parameters:
   -----------
   int   a;
   String  b;
   Kutta   k1;
   Pilla   p1;
   
*/

class Chair
{
	void setChairPrice(double chairPrice,String brandName){
		System.out.println(chairPrice +"  "+brandName);
	}
	
	void  m1(ITM  obj){
		obj.login();
	}
}
class ITM
{
	String name;
	String address;
	long contact;
	
	 void login(){
		System.out.println("hello itm");
	 }
}
class Parameters 
{
	public static void main(String[] args) 
	{
		Chair  c1=new Chair();
		c1.setChairPrice(1000.0,"Nilkamal");//method calling
		ITM  t1=new ITM();
		t1.name="ITM Universe";
		t1.address="Gwalior";
		t1.contact=983247564L;
		c1.m1(c1);
	}
}
