/*
1st way:-at the time of declaration

    int  rno=101;
	String  name="Raja";
==========================''
	
2nd way : by calling with obj_ref

Student1  obj=new Student1();
		obj.rno=101;
		obj.name="Raja";
		
========================================

Student1  obj=new Student1();
		obj.setRno(101);
		obj.setName("Raja");
========================================

why???

Rules to define java constructor:
------------------------------------
1. name of constructor and name of class must be same 
2. we can't use return type with constructor
3. if we are using return type with constructor then -----method
4. constructor will be executd at the time of creation
5. public , private , default , protected
6. 
	
	
*/

final class SuperStudent
{
	String name;
	SuperStudent(String name){
		this.name=name;
	}
	
	SuperStudent(){
		System.out.println("SuperStudent with 0 param");
	}
}
class Student1 extends SuperStudent
{
	long mno;
	String  address;
	
	Student1(long mno){
		System.out.println("Student with long param");
		this.mno=mno;
	}
	
	Student1(String  address){
		System.out.println("Student with String param");
		this.address=address;
	}
	
	void printData(){
		System.out.println(name +"  "+mno +"  "+address);
	}
}
class DataInitialization 
{
	
	public static void main(String[] args) 
	{
		Student1 s1=new Student1(347745L);
		Student1 s2=new Student1("Govind Nagar");
		SuperStudent  sp=new SuperStudent("Raja");
		s1.printData();
		
	}
}
