//this , super

class Parent4
{
	String  name="Raja";
}
class Child4 extends Parent4
{
	String name="Raju"; //heap area within object
	
	static void  getName(){
		//String name="Kaju"; //local variable--Stack - method execution
		System.out.println(name);
	}
}
class  ThisSuperDemo1
{
	public static void main(String[] args) 
	{
		Child4  obj=new Child4();
		obj.getName();
	}
}
