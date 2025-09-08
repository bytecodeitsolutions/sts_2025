/*
   this()
   super()
   this
   super
   
   constructor chaining
   constructor overloading
*/

class Parent
{
	int  a=10;
	
	
}
class Child extends Parent
{
	int  a=100;
	
	static void  m1(){
	int  a=200;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class  ThisSuperDemo1
{
	public static void main(String[] args) 
	{
		Child  c1=new Child();
	
		c1.m1();
		
	}
}
