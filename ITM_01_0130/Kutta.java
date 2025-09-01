/*
   Object oriented programming:
   -----------------------------
   Syntax for class (Design):
   ---------------------------
   
   class  ClassName{
   
   
   }
   
   Syntax to create an object:
   -------------------------------
   
   ClassName  object_reference_variable=new ClassName();
   
   class  Kutta{
   
   }
   
   Kutta   k1=new Kutta();
   int     k2=10;
   
*/
class Kutta 
{
	void bark(){
		Kutta  k1=new Kutta();
		System.out.println("kutta bhok rha hai "+k1.hashCode());
	}
	public static void main(String[] args) 
	{
		Kutta  k1=new Kutta();
	
		k1.bark();
	
		System.out.println(k1.hashCode());
	}
}
