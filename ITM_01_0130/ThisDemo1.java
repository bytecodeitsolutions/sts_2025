/*
 this
 super
 
 this()
 super()
 
 constructor chaining
 constructor overloading
 ==============================================
*/
class Test
{
	 int  a;
	 Test(int  x){
		a=x;
	 }
	 
	 void  getA(){
		System.out.println(this.hashCode() +" The value of a="+a);
	 }
}
class  ThisDemo1
{
	public static void main(String[] args) 
	{
		Test t1=new Test(10);
		Test t2=new Test(15);
		Test t3=new Test(20);
		t3.getA();
		t2.getA();
		t1.getA();
	}
}
