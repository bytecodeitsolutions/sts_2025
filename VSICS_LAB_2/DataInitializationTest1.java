/*
    data initialization:
	--------------------
	1.
	
	
*/

class DataInitializationDemo1
{
	int   a;//first
	int  b;
	private int  c;
	int  d;
	
	public void setC(int  c){
		this.c=c;
	}
	
	
	DataInitializationDemo1(int  d){
		this.d=d;
	}
	
	void  printValues(DataInitializationDemo1  obj){
		System.out.println(obj);
	}
	
	public String toString(){
		return "[ a=" +a +" b="+b +" c="+c +" d="+d +"]";
	}
}
class  DataInitializationTest1
{
	public static void main(String[] args) 
	{
		DataInitializationDemo1  obj=new DataInitializationDemo1();
		obj.printValues(obj);
	}
}
