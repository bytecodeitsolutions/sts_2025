class Parent
{
	 int  a;
	 long  x;
	 
	 Parent(long x){
		this.x=x;
	 }
	 
	 Parent(int  a){
		 this(20L);
		this.a=a;
	 }
}

class Child extends Parent
{
	 String  s;
	 float  b;
	 
	 Child(String  s){
		this(10.0f);
		this.s=s;
	 }
	 Child(float  b){
		 super(100);
		this.b=b;
	 }
	 
	 void  getAllData(){
		System.out.println("s="+s +" b="+b +" a="+a +" x="+x);
	 }
}
public class ConstructorDemo2 
{
	
	public static void main(String[] args) 
	{
		Child  c1=new Child("java");
		c1.getAllData();
	}
}
