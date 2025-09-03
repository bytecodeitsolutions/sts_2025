/*
   static variable ko memory kb milti hai aur ek bar hi kyu milti hai
*/

class Test1
{
	static int  a=10;
	int  b=20;
}
class Test2
{
	static int  x=100;
	int y=20;
}
class  StaticVarDemo2
{
	static{
		System.out.println("static block from StaticVarDemo2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		
		Test2 t2=new Test2();
		
		Test2 t4=new Test2();
		
		Test2 t6=new Test2();
	}
}
