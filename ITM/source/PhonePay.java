package in.itm.service.impl;
import in.itm.service.PayementService;
public class PhonePay implements PayementService 
{
	  public void payment(double  bal){
		 System.out.println("Payment of rupees "+bal +" done using phonepay");
	  }
}
