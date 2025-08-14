/*
    try with multiple catch block
*/

class  ExceptionDemo5
{
	public static void main(String[] args) 
	{
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello3");
		try{
		int  a=Integer.parseInt(args[0]);
		int  b=Integer.parseInt(args[1]);
		System.out.println(a/b);
		}
		
		catch(ArithmeticException e1){
			System.out.println("Please enter non zero values");
		}
		catch(NumberFormatException e1){
			System.out.println("Please enter only integer");
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("Please enter min 2 values values");
		}
		/*
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("Please enter min 2 values values");
		}
		*/
		catch(Exception e1){
			System.out.println("unknown exception");
		}
		
		System.out.println("hello4");
		System.out.println("hello5");
	}
}
