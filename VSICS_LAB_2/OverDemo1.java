/*
   Overriding:
   -----------
   if child is not satisfied with parent class method implementation (logic) then 
   Child is allowed to define same method with different functionality but method
   name and parameter must be same then this concept is known as overriding.
*/
class Animal
{
	void marry(){
		System.out.println("marry according to parent");
	}
	void run(){
		System.out.println("animal is running");
	}
	void speak(){
		System.out.println("hahahaha");
	}
}
class Dog extends Animal
{
	void speak(){
		System.out.println("bho bho");
	}
}

class Cat extends Animal
{
	void speak(){
		System.out.println("mew mew");
	}
	void marry(){
		System.out.println("marry with friend");
	}
}

class OverDemo1 
{
	public static void main(String[] args) 
	{
		Cat  c1=new Cat();
		c1.speak();
		c1.marry();
		c1.run();
		
		Dog  d1=new Dog();
		d1.speak();
		d1.marry();
		d1.run();
		
	}
}
