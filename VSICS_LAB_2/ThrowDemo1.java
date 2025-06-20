/*
   throw
   throws
*/


class  ThrowDemo1 extends Exception
{
	ThrowDemo1(String  msg){
		super(msg);
	}
	public static void main(String[] args) throws ThrowDemo1
	{
		throw new ThrowDemo1("only for demo");
	//	throw new java.lang.ArithmeticException("/ by zero");
	}
}

/*
   Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ThrowDemo1.main(ThrowDemo1.java:11)
		
		
   Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ThrowDemo1.main(ThrowDemo1.java:11)
*/