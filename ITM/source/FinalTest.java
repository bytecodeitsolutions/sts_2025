class A 
{
	final int a;
	
	A(){
		a=100;
	}
	
}

class FinalTest
{
	public static void main(String[]  args){
		A  a=new A();
		a.a=20;
		System.out.println(a.a);
	}
}
