//super()  ==>super
//this()   ==>this


class Parent
{
	//int  a=100;
}
class Child extends Parent
{
	//int  a=200; //a is a non static ==>this super 
	void  sum(){
		int  a=300;
		System.out.println(this.a);
	}
}
class  SuperDemo2
{
	public static void main(String[] args) 
	{
		Child  c1=new Child();
		c1.sum();
	}
}
