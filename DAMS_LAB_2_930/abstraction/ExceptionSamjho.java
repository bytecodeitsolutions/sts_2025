/*
    Exception handling:
	-------------------
	
	Exception:
	----------
	Any unwanted , unexpected event which disturbs the normal flow of program
	is called exception.
	
	class please see screen - I am not able to speak
	
	suppose we have a class with some print statement
	
	it means we dont have any issue in our given statement
*/

class  ExceptionSamjho
{
	public static void main(String[]  args){
		System.out.println("hello-1");
		System.out.println("hello-2");
		try{
			//risky means whisky code
		    System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}
	//	int  a=10;
		catch(Exception  obj){
			
			//handling code
			System.out.println(obj.getClass().getName());
		}
		
		System.out.println("hello-4");
		System.out.println("hello-5");
		
	}
}

