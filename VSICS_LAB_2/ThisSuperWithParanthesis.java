class Parent5
{
	String  name;
	Parent5(String name){
		this.name=name;
	}
	
	Parent5(){
		
	}
	
}
class Child5 extends Parent5
{
	long mno;
	String address;
	
	Child5(String  address){
		
		this.address=address;
	}
	
	Child5(long mno){
	this.mno=mno;
		
	}
	void  printCustomerData(){
	   System.out.println(name +" "+address +" "+mno);
	}
}
class ThisSuperWithParanthesis 
{
	public static void main(String[] args) 
	{
		Child5  obj=new Child5(14364L);
		Child5  obj1=new Child5("Delhi");
		Parent5  pbj2=new Parent5("Raja");
		obj.printCustomerData();
	}
}
