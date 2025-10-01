/*
  
   Inheritance:
   ------------
   why??
   
   code reusability
   ----------------
   
   how==extends
   
   ============================================
   
   Parent | Base | Super ==>jiski properties aur functionalities access krni hai
   
   eg: Animal 
   
   Child | Derived | subclass ==>jo kisi dusre class ki properties and functionalities ko access krta hai
   
   eg: Dog
   =====================================================================
   
*/

class Animal  //Parent
{
	String name;
	
	void speak(){
		System.out.println(name +" is speaking");
	}
}
class Dog extends Animal //Dog--Child
{
	
}
class Cat extends Animal
{
	
}
class Buffallo extends Animal
{
	
}
class Cow extends Animal
{
	
}
class  InheritanceDemo1
{
	public static void main(String[] args) 
	{
		Buffallo  c1=new Buffallo();//cow ka object (memory) [data aur method] bnaya hai
		c1.name="bhais";
		c1.speak();//speak method ko call kr rhe hai
	}
}
