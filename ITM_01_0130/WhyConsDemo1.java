/*
    
	
*/

class Addition
{
	int  a;
	int  b;
	
	Addition(int  a1,int  b1){
		System.out.println("1==>before a+b in constructor method="+(a+b));//1
		a=a1;
		b=b1;
		System.out.println("2==>after a+b in constructor method="+(a+b));//2
	}
	void sum(){
		System.out.println("3==>a+b in sum method="+(a+b));//3
	}
}
class  WhyConsDemo1
{
	public static void main(String[] args) 
	{
		Addition  obj=new Addition(10,20);
		obj.sum();
	}
}
