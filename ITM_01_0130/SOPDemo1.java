class System1
{
	static PrintStream1 out;
	static{
		out=new PrintStream1();
	}
}
class PrintStream1
{
	 void println(String  msg,String msg1){
		System.out.println(msg +" "+ msg1);
	 }
	 void println(int  val){
		System.out.println(val);
	 }
}
class  SOPDemo1
{
	public static void main(String[] args) 
	{
		System1.out.println("our println method","hello");
	}
}
