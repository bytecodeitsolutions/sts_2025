class Dog
{
	String dogName;
	int  age;
}

class NonStaticVariableDemo3 
{
	public static void main(String[] args) 
	{
		Dog  d1=new Dog();
		Dog  d2=new Dog();
		Dog  d3=new Dog();
		Dog  d4=new Dog();
		
		d1.dogName="Sheru";
		d1.age=5;
		System.out.println(d1.dogName);
		System.out.println(d1.age);
	}
}
