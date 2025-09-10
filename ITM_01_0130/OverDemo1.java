abstract class Parent
{
	 abstract void drink(String... brandName);
}
class Child 
{
	
}


//=========================================================


abstract class Flipkart
{
	abstract void deliverProduct();
}
abstract class Ekart extends Flipkart
{
	
}
class Bluedart extends Flipkart
{
	void deliverProduct(){
		System.out.println("by using chhota hathi");
	}
}
class OverDemo1 
{
	public static void main(String[] args) 
	{
		Flipkart  f1=new Flipkart();
		
	}
}
