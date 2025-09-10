/*
   Overriding 
   ===========
   Case-1:
      co-variant return type
   Case-2: overriding always dependes on "object" created within JVM
   
   CheckSound  c=new CheckSound();
		Animal  a1=null;
		
		if (args[0].equals("animal"))
		{
			a1=new Animal();
		}
		else if (args[0].equals("dog"))
		{
			a1=new Dog();
		}
		else if (args[0].equals("puppy"))
		{
			a1=new Puppy();
		}
		else{
			a1=null;
		}
		
		c.getAnimalSound(a1);
   
   Case-3:
     
      
	  
*/
class Animal
{
	void speak(){
		System.out.println("hoooo hooo");
	}
}
class Dog extends Animal
{
	void speak(){
		System.out.println("bho bho");
	}
}
class Puppy extends Dog
{
	void speak(){
		System.out.println("pe pe pe");
	}
}

class CheckSound
{
	void getAnimalSound(Animal  obj){
		obj.speak();
	}
}


















/*
   Case-3:
   
   private
   
   Case-4:
   
   final 
   
   case-5:
   
   private<default<protected<public
   
   case-6:
     abstract 
*/




abstract class Parent
{
	abstract void  marry();
}
class Child extends Parent
{
	void marry(){
		System.out.println("marry with friend");
	}
}
abstract class Child1 extends Parent
{
	
}
class  OverDemo2
{
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
	}
}
