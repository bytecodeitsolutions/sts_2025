class Student
{
	int  rno;
	String name;
	String address;
	long pmn;
	long smn;
	
	Student(int rno1,String name1,String address1,long pmn1){
		rno=rno1;
		name=name1;
		address=address1;
		pmn=pmn1;
	}
	
	void displayStudentRecord(){
		System.out.println("rno="+rno);
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("primary mobile number ="+pmn);
		System.out.println("second mobile number="+smn);
	}
}
class  WhyConstructor
{
	public static void main(String[] args) 
	{
		Student  s1=new Student(101,"Raja","sitholi",12345L);//creating //object with data
		Student  s2=new Student(102,"Rani","Gwalior",12347L);
		s1.smn=486756L;
		//s2.smn=748566L;
		
		s1.displayStudentRecord();
		s2.displayStudentRecord();//function calling
	}
}
