package in.itm.service.impl;
import in.itm.service.PayementService;
public class DebitCard implements PayementService 
{
	  public void payment(double  bal){
		 System.out.println("Payment of rupees "+bal +" done using debit card");
	  }
}
