/*
try
catch
finally
------------------------------------------------------------
   throw keyword:
   --------------
      InvalidProductException
	  InvalidEmployeeException
	  ProductNoTFOundException
	  InValidPinException
*/
class  ExceptionDemo8
{
	public static void main(String[] args) 
	{
		try{
			int  b=30;
		throw new ProductNotFoundException("Please eneter a valid product"); 
		//int  a=10;
		
		}catch(ProductNotFoundException pnfe){
			System.out.println(pnfe.getMessage());
		}
		System.out.println("after exception handling");
	}
}



class ProductNotFoundException  extends RuntimeException
{
	ProductNotFoundException(String msg){
		super(msg);
	}
}

/*
System.out.println(10/0);
   Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo8.main(ExceptionDemo8.java:17)

throw new ArithmeticException("/ by zero");
  Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo8.main(ExceptionDemo8.java:17)


class ProductNotFoundException  extends Throwable
{
	
}


//throw new ArithmeticException("/ by zero");
		//int  a=10;
		
	//Thread.sleep(1000);//InterruptedException is a //CheckedException
*/