/*
   Object oriented programming concepts:
   -------------------------------------
   Has-A relationship:
   -------------------
    
*/
class Engine
{
	void start(){
		System.out.println("Engine started");
	}
}
class Car
{
	Engine  e1;//non static -Non Primitive==default==null
	void move(){
		e1.start();
		System.out.println("Car is moving");
	}
}
class  HasARelDemo1
{
	public static void main(String[] args) 
	{
		Car  c1=new Car();
		c1.move();
	}
}
