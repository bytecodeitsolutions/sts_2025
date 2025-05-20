class  Dog
{
	void bark(){
		System.out.println(hashCode()+" dog is barking");
	}
	
}

class Demo1
{
	public static void main(String[] args){
		Dog  d1=new Dog();
		Dog  d2=new Dog();
		Dog  d3=new Dog();
		
		d1.bark();
		d2.bark();
		d3.bark();
		
		System.out.println("==================");
		d1.bark();
		d1.bark();
		d1.bark();
	}
}


