class Parent
{
	int  a=10;
}
class Child extends Parent
{
	int  a=100;
	
	void  m1(){
		int  a=1000;
		System.out.println("a="+super.a);
	}
}
class  SuperDemo1
{
	public static void main(String[] args) 
	{
		Child  c1=new Child();
		c1.m1();
	}
}
