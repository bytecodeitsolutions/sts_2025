class Demo
{
	int  a=10;
	static int  b=20;
}
class TestVariable 
{
	public static void main(String[] args) 
	{
		Demo  d1=new Demo();
		Demo  d2=new Demo();
		d1.a=100;
		d1.b=200;
		System.out.println(d2.a);//
		System.out.println(d2.b);//
	}
}
