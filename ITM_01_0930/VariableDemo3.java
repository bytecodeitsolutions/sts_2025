







class Test4
{
	int  a=10;
	static void m1(){
		Test4  obj1=new Test4();
		obj1.a++;
		System.out.println(obj1.a) ;
	}
}
class VariableDemo3 
{
	public static void main(String[] args) 
	{
		Test4  obj1=new Test4();
		Test4  obj2=new Test4();
		Test4  obj3=new Test4();
		obj1.a=110;
		obj2.a=120;
		obj3.a=130;
		obj1.m1();
		obj1.m1();
		obj1.m1();
	}
}
