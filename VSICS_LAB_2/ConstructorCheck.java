class Addition
{
	int  a;
	int  b;
	Addition(int x, int  y){
		System.out.println(x+y);
		a=x;
		b=y;
	}
	
	void  sum(){
		System.out.println(a+b);
	}
}
class  ConstructorCheck
{
	public static void main(String[] args) 
	{
		Addition  obj=new Addition(10,20);
		obj.sum();
	}
}
