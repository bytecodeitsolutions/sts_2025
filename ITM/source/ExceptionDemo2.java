/*
  Runtime Stack mechanism:
  ------------------------
*/
class ExceptionDemo2 
{
	void m1(){
		m2();
		System.out.println("m1 method");
	}
	void m2(){
		m3();
		System.out.println("m2 method");
	}
	void m3(){
		m4();
		System.out.println("m3 method");
	}
	void m4(){
		System.out.println(10/0);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("before main method");
		ExceptionDemo2  obj=new ExceptionDemo2();
		obj.m1();
		System.out.println("after main method");
	}
}
