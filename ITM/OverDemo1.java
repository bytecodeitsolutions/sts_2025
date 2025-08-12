/*
  Runtime poly [ dynamic poly | late binding]
   Overriding:
   -----------
   
   Why????
   
   if Child is not satisfied with parent class implementation then Child is allowed to define that method according to our implementaion.
*/

class Parent
{
	void marry(){
		System.out.println("Marry according to parent");
	}
	
	void  property(){
		System.out.println("1000 cr rupees");
	}
}
class Child extends Parent
{
	void marry(){
		System.out.println("Marry according to child");
	}
}
class Child1 extends Parent
{
}
class  OverDemo1
{
	public static void main(String[] args) 
	{
		Child  c1=new Child();
		c1.marry();
		c1.property();
	}
}
