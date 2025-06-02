import static java.lang.System.out;
class Confusion
{
	int  a=10;
	static int b=20;
	
	static void sum(){
		out.println(b);
	}
	
	void println(){
		out.println("our println method");
	}
}
class  StaticNonStaticConfusion
{
	public static void main(String[] args) 
	{
		Confusion.sum();
		Confusion  out=new Confusion();
		out.println();
	
	}
}
