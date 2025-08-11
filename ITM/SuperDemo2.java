class Parent1
{
	int  a=100;
}
class Child1 extends Parent1
{
	int  a=200;
	int  b;
	static void  m1(){
		int  a=300;
		System.out.println("The value of a="+super.a);
		System.out.println("The value of b="+b);
	}
}
class  SuperDemo2
{
	public static void main(String[] args) 
	{
		Child1  c1=new Child1();
		c1.m1();
	}
}
