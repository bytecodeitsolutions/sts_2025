
class  VariableDemo1
{
	static int  a=10;//only once --->Method Area (Common for all object)  ->single copy
	                 //--access-->ClassName,obj_reference
					 //VariableDemo1.a 
					 //VariableDemo1  obj=new VariableDemo1(); -->obj.a
	       int  b=20; //seperate within object , access-->obj_reference==>obj.b
		              //heap area 
		   
	public static void main(String[] args) 
	{
		   int  c=30; //Stack --->method calling (execution) within stack 
		System.out.println(VariableDemo1.a);
		VariableDemo1  obj=new VariableDemo1();
		System.out.println(obj.b);
		System.out.println(c);
		//System.out.println(d);
	}
	
	void  m1(){
		int  d=40;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
	}
}
