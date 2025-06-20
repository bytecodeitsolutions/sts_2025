/*
  try
  catch
  finally
  
  diference between final , finally and finalize()
  case-1:
  Case-2:
  Case-3:
  Case-4:
  
*/
/*
    Object:
	  |
	  |
	Throwable
	  |-Exception
	      |
		  |----------------IOException                ---SQLException --ServletException InterruptedException
		                         |-FileNotFoundException
		  |
		  |-------------------RuntimeException
		                         |-IndexOutOfBoundsException
								            |-ArrayIndexOutOfBoundsException
											|-StringIndexOutOfBoundsException
								 |-ArithmeticException
								 |-NumberFormatException
								 |-NullPointerException
								 |-.....
								 
	  |-Error
	      |-OutOfMemoryError
		  |-StackOverFlowError
		  
	Checked Exception------->
	Unchecked Exception
*/
class  FinallyDemo1
{
	public static void main(String[] args) throws InterruptedException
	{
		try{
		   Thread.sleep(1000);
		}catch(InterruptedException ie){}
		//System.out.println(10/0);
	}
}
