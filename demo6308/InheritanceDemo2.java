/*
    Case-1:
	-------
	
	agr parent ka object hai   ==>new Parent()
	aur parent ka reference hai==>Parent  p1
	
	Parent  p1=new Parent();
	
	to parent sirf apni hi properties aur methods ko access kr skta hai lekin
	child ki properties and functionalities ko access nhi kr skta
	
	
	Case-2:
	
	agr Child ka object
	aur Child ka reference hai
	
	to child apni aur parent dono ki properties  and functionalities ko access
	kr skta hai
	
	
	Case-3:-
	
	agr Parent ka reference hoga ============>Parent  p1
	aur Child  ka object hoga to kya hoga?===>new Child()
	
	to sirf parent ki properties and functionalities hi call hogi aur child 
	ki nhi hogi.
	
	why???
	=====================================================================
	
	Case-4:
	
	agr Parent ka object ho==>new Parent();
	
	aur Child ka reference hai===>Child  c1
	
	Child c1=new Parent();
	
	to Parent child me nhi ja skta hai.
	aisa direct possible nhi hai
	
	InheritanceDemo2.java:67: error: incompatible types: Parent cannot be converted to Child
                Child  c1=new Parent();
				
				
======================================================================
Case-4 : ka  dusra roop:-
Parent ka object child me ja bhi skta hai --sir kaise?

Parent  p1=new Child();
Child  c1=p1;
	
	
	InheritanceDemo2.java:79: error: incompatible types: Parent cannot be converted to Child
        Child  c1=p1;
*/

class Parent
{
	int  a=10;
	
	void  m1(){
		System.out.println("m1 method from Parent");
	}
}
class Child extends Parent
{
	int  b=20;
	void  m2(){
		System.out.println("m2 method from Child");
	}
	
}
class  InheritanceDemo2
{
	public static void main(String[] args) 
	{
		Parent  p1=new Child();
        Child  c1=(Child)p1; //type casting
		p1.m1();
		//p1.m2();
		c1.m1();
		c1.m2();
	}
}
