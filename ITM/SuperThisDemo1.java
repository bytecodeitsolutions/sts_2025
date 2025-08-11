class Test1
{
	Test1(int  a){
        this();
		System.out.println("1 param parent");
	}
	Test1(){
		System.out.println("0 param parent");
	}
}
class Test extends Test1
{
	int  a;
	int  b;
	String  s;
	Test(){
		this(a);
		System.out.println("0 param constructor");
	}
	Test(int  a){
		this(a,b);
		this.a=a;
		System.out.println("1 param constructor");
	}
	Test(int  a, int  b){
		super(a);
		System.out.println("2 param constructor");
	}
}
class  SuperThisDemo1
{
	public static void main(String[] args) 
	{
		Test  t1=new Test();
	}
}
