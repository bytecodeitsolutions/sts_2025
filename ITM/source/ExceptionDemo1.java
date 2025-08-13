/*
   Exception Handling in java:
   ---------------------------
   Introduction
      What is exception 
	  What is the meaning of exception handling
   Runtime stack mechanism
   Default exception handler
   Exception hierarcy
      Checked exception
	     Partially checked exception
		 fully checked exception
	  Unchecked exception
  customized exception handling  using try-catch
  control flow in try-catch
  methods to print exception information
  finally block
  control flow in try -catch -finally
  different combinations of try-catch-finally
  difference between final , finally and finalize
  our custom exception
    |=throw keyword 
	|=throws keyword
  try with resources
  try with multi catch
  
	  
   
*/

class ExceptionDemo1
{
	public static void main(String[] args){
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello3");
		try{
		int  a=Integer.parseInt(args[0]);
		int  b=Integer.parseInt(args[1]);
		System.out.println(a/b);
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
		System.out.println("hello4");
		System.out.println("hello5");
	}
}
