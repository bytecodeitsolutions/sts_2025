class ConstructorDemo2 
{
	int  a;
	String  s;
	ConstructorDemo2(int  a,String  s){
		this.a=a;
		this.s=s;
	}
	
	void printObjectData(){
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		ConstructorDemo2  obj1=new ConstructorDemo2(100,"raja");
		ConstructorDemo2  obj2=new ConstructorDemo2(200,"rani");
		obj1.printObjectData();
		obj2.printObjectData();
	}
}
