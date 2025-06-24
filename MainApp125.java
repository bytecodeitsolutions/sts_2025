/*

   int   a;
   String  s;
   double  fee;
   long phone;
   
   Kutta  k1;
   ShopKeeper  sk;
   
*/

class Customer
{
	 void getItems(ShopKeeper  sk){
		Jhola  a=sk.items();
		System.out.println(a.item1);
		System.out.println(a.item2);
		System.out.println(a.item3);
		System.out.println(a.item4);
		float b=sk.totalPrice();
		System.out.println(b);
	 }
}
class ShopKeeper
{
	Jhola  jhola;
	Jhola  items(){
		Jhola  obj=new Jhola();
		jhola=obj;
		obj.item1="dal";
		obj.item2="chawal";
		obj.item3="aata";
		obj.item4="tel";
		return  obj;
	}
	
	float  totalPrice(){
		float totPrice=0.0f;
		if (jhola.item1.equals("dal"))
		{
			int  dp=Integer.parseInt(PriceList.dalPrice);
			totPrice=dp*5;
		}
		return totPrice;
	}
	
}
class PriceList
{
	static String  dalPrice="130";
	static String  chawalPrice="50";
	static String  aataPrice="40";
	static String  telPrice="140";
}
class Unit
{
	static String unit1="Kg";
	static String unit2="Ltr";
}
class Jhola
{
	String item1;
	String item2;
	String item3;
	String item4;
}
class  MainApp125
{
	public static void main(String[] args) 
	{
		Customer  c1=new Customer();
		ShopKeeper  obj=new ShopKeeper();
		c1.getItems(obj);
	}
}
