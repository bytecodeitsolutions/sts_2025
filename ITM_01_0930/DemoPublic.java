package p1;
public class  ModifierDemo1 extends DemoPublic
{
	public void  m1(){
		System.out.println("this is public method");
	}
	protected void  m2(){
		System.out.println("this is protected method");
	}
	
	void  m3(){
		System.out.println("this is default method");
	}
	
	
	private void  m4(){
		System.out.println("this is private method");
	}
	
	
	public static void main(String[] args) 
	{
		ModifierDemo1  obj=new ModifierDemo1();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}

class DemoPublic
{
}
class DemoPublic2
{
}

