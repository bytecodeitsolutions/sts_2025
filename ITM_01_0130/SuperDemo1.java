class Parent
{
	Parent(){
		System.out.println("Parent class 0 param constructor");
	}
	
	Parent(int  a){
		this();
		System.out.println("Parent class int param constructor");
	}
}
class Child extends Parent
{
	Child(){
		super(10);
		System.out.println("Child class 0 param constructor");
	}
}
class  SuperDemo1
{
	public static void main(String[] args) 
	{
		Child  c1=new Child();
	}
}
