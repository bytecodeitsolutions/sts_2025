//byte-->short-->int--->long--->float-->double

class OLTest2
{
	
	void  m1(String s){
		System.out.println("string");
	}
	
	void  m1(OLTest2  sb){
		System.out.println("object");
	}
}
class OLDemo2 
{
	public static void main(String[] args) 
	{
		OLTest2  obj=new OLTest2();
		obj.m1(null);
	}
}
