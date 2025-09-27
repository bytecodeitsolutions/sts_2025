/*
   Rules to define a java constructor:
   ----------------------------------
   1. class name and constructor name must be same
   2. at the time of object creation , constructor will be executed
   3. we can not use return with constructor->no CE , No->RE
   4. we can use private ,default , protected , public modifier ==?
   5. 
   
   
*/
class  ConstructorDemo2
{
	int  a;
	
	public ConstructorDemo2(int  x){
		a=x;
	}
	
	void m1(){
		int  a=100;
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		ConstructorDemo2 obj1=new ConstructorDemo2(10);
		ConstructorDemo2 obj2=new ConstructorDemo2(20);
		
		System.out.println("obj1="+obj1.hashCode());
		System.out.println("obj2="+obj2.hashCode());
		
		obj1.m1();
		obj2.m1();
	}
}
