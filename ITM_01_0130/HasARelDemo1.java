/*
   Object oriented programming concepts:
   -------------------------------------
   Has-A relationship:
   -------------------
   IS-A Relationship: (Inheritance)
   ----------------------------------
    
*/
class Engine  //Parent | base | Super
{
	void start(){
		System.out.println("Engine started");
	}
}
class Car extends Engine //Car-=Child | sub | derived
{
	void move(){
		System.out.println("Car is moving");
	}
}
class  HasARelDemo1
{
	public static void main(String[] args) 
	{
		/*
		   Case-1:
		   if we have the object of Parent and ref of Parent then we can 
		   only Parent class properties(data) and functionalities (methods).
		   Engine  e1=new Engine();
		   
		   Engine  e1=new Engine();
		e1.start();
		//e1.move();
		
		
		Case-2:
		
		if we have Object of CHild class and ref of Child then we can access both parent and child class variables and methods.
		
		Car  c1=new Car();
		c1.start();
		c1.move();
		
		Case-3:
		
		if we have object of Child class and reference of Parent class
		
		
		Engine  p1=new Car();
		p1.start();
		p1.move();
		
		Case-4:
		
		if we have object of Parent and ref of Child
		
		*/
		
		//Car  c1=new Engine();
		Engine  e1=new Car();//object of Child and e1 is ref of Parent
		Car  c1=(Car)e1;
		c1.start();
		c1.move();
		
		System.out.println(c1.getClass());
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
	}
}
