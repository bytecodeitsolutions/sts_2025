class Exam2
{
	static int  a=10;
	void m1(){
		a++;
		System.out.println(a);
	}
}
class  AnswerBtao2
{
	public static void main(String[] args) 
	{
		Exam2 obj1=new Exam2();
		Exam2 obj2=new Exam2();
		obj1.m1();
		obj2.m1();
		obj1.m1();
	}
}
