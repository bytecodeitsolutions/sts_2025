class Laptop
{
	static void switchOnLaptop(){ //static method declaration
		System.out.println(" laptop opened");
	}
	
	static void switchOffLaptop(){
		System.out.println(" laptop closed");
	}
}
class MethodDemo2 
{
	public static void main(String[] args) 
	{
		Laptop  b1=new Laptop();//object creation syntax
		Laptop  b2=new Laptop();
		Laptop  b3=new Laptop();
		Laptop  b4=new Laptop();
		b1.switchOnLaptop();//static method calling-1
		Laptop.switchOffLaptop();//static method calling-2
	}
}
