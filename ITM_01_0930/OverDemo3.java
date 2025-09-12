class Parent
{
	static void m1(){ //Method area==>only once ==>at the time of class loading
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	static void m1(){//heap area ==>depends on no of object==>at the time of object //creation
		System.out.println("Child");
	}
}

class  OverDemo3
{
	public static void main(String[] args) 
	{
		Parent  p1=new Parent();//Parent
		Child   c1=new Child();//Child
		Parent  p2=new Child();//Child
		p1.m1();
		c1.m1();
		p2.m1();
		
		
	}
}
