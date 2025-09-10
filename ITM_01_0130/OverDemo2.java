class Parent
{
	static void m1(){
		System.out.println("parent");
	}
}
class Child extends Parent
{
	static void m1(){
		System.out.println("child");
	}
}
class OverDemo2 
{
	public static void main(String[] args) 
	{
		Parent  p1=new Parent();
		Child   c1=new Child();
		Parent  p2=new Child();
		p1.m1();
		c1.m1();
		p2.m1();
			
	}
}
