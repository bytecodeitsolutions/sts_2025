class Exam1
{
	int  a=10;
	static int  b=20;
}
class AnswerBtao 
{
	public static void main(String[] args) 
	{
		Exam1  e1=new Exam1();
		Exam1  e2=new Exam1();
		e1.a=100;
		e1.b=200;
		System.out.println(e2.a);
		System.out.println(e2.b);
	}
}
