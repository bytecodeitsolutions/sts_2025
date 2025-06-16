class Parent10
{
	int  a=10;
}
class Child10 extends Parent10
{
	int  a=20;
	
	void  m1(){
		int  a=30;
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

class CheckVariable 
{
	public static void main(String[] args) 
	{
		
		Child10.m1();
	}
}
