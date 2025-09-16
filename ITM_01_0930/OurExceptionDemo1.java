class ProductNotFoundException extends RuntimeException //checked
{
	ProductNotFoundException(String msg){
		super(msg);
	}
}
class OurExceptionDemo1 
{
	public static void main(String[] args) 
	{
		throw new ProductNotFoundException("Invalid product");
	
	}
}

/*
   Exception in thread "main" java.lang.ArithmeticException: / by zero
        at OurExceptionDemo1.main(OurExceptionDemo1.java:9)
		
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at OurExceptionDemo1.main(OurExceptionDemo1.java:9)
*/