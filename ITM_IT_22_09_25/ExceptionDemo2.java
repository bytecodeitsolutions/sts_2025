/*
   What is exception?
*/
class  ExceptionDemo2
{
	static String name;
	public static void main(String[] args) 
	{
		System.out.println("hello");
		try{
		   System.out.println(name.length());//risky  code //java.lang.NullPointerException
		}catch(NullPointerException ae){//handling code
			System.out.println("aisa lg rha hai ki string null hai "+ae.getClass());
		}
		     System.out.println("hi");
		try{
		    System.out.println(10/0);//java.lang.ArithmeticException
		}catch(ArithmeticException ae){
			System.out.println("aisa lg rha hai ki 0 se divide kiya hai");
		}
		System.out.println("how are you?");
	}
}

