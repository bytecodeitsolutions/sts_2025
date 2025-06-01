/*
   Types of methods:
   -----------------
   
   why?
   
   how to define method?  
   
   returnType  methodName(){
   
   
   }
   
   returnType===????====>void
   methodName===????====>run , sleep , drink , smoke , study, .....
   
   
   
   ex:
   void smoke(){
   
   }
   
   void run(){
   
   }
   
   void see(){
   
   }
   
   
   
   //How to create an object:
   
   ClassName  obj_ref_var=new ClassName();
   Dog         dog1      =new  Dog();
   Dog         dog2      =new  Dog();
   
   method calling
   
   obj_ref_variable.methodName();
   
   Type of methods:
   ----------------
   
   static method  -----store-->only once ---access-->ClassNAme , obj_ref==single
   non static method--store===>objects --->seperate------>obj_ref
   
   
   =============================================
   static :
   
    static void  drink(){
   
    }
	
	ClassName.methodName();
	============================
	non static:
	*****************************
	void  smoke(){
	
	
	}
	obj.methodNAme();
   
*/

class  Dog
{
	
	//data
	String name;
	int    age;
	//methods
	
	void  bark(){
		System.out.println(name +" dog is barking and age is "+age);
	}
	void sleep(){
		System.out.println(name +" is sleeping");
	}
	
}
class MainApp
{
	public static void main(String[]  args){
	      Dog         dog1      =new  Dog();//obj_ref_variable.methodName();
          Dog         dog2      =new  Dog();
		  Dog         dog3      =new  Dog();
		  
		  dog1.name="Sheru";
		  dog1.age=10;
		  //method calling
		  dog1.bark();
		  dog1.bark();
		  Shop.shopName="Kutta Shop";
		  Shop.shopAddress="Near Dams";
		  Shop.contactNumber=3637474L;
		  
		  Shop.getShopDetails();
		  
	}
}

class Shop
{
	static String shopName;
	static String shopAddress;
	static long contactNumber;
	
	static void getShopDetails(){
		System.out.println("Shop name is ="+shopName);
		System.out.println("Shop address is ="+shopAddress);
		System.out.println("Shop contact is ="+contactNumber);
	}
}