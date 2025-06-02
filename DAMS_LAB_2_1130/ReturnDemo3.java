class ReturnDemo3 
{
	static int  m1(){
		return 10;
		
	}
	public static void main(String[] args) 
	{
		int  a=ReturnDemo3.m1();
		int  b=m1();
		ReturnDemo3 obj=new ReturnDemo3();
		int  c=obj.m1();
		
		System.out.println(a);
	}
}
