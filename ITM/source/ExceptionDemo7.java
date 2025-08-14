class ExceptionDemo7 
{
	public static void main(String[] args) 
	{
		try{
		  try{
			
		  }
		  catch(Exception e){
		
		}
		
		} 
		catch(ArithmeticException e){
		   System.out.println("Hello World!-5");
		}
		finally{
			System.out.println("closing db connection");
		}
		
		
		
	}
}
