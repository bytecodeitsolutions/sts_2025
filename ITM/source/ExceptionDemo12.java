class ExceptionTest1 extends RuntimeException
{
	
}
class ExceptionDemo12 
{
	static ExceptionTest1  e;
	public static void main(String[] args) 
	{
		throw e;
	}
}
