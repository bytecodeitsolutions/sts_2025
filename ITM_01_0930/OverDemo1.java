class Student
{
	int  rno;
	String name;
	
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	
	void getStudentData(Student  s1){
		System.out.println(s1);
	}
	
	public String toString() {
		return "[ rollNumber ="+rno +" Name ="+name +"]";
	}
}
class  OverDemo1
{
	public static void main(String[] args) 
	{
		Student  s1=new Student(101,"Raja");
		Student  s2=new Student(102,"Rani");
		s1.getStudentData(s1);
		s2.getStudentData(s2);
	}
}
