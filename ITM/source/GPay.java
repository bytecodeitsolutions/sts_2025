package in.itm.service.impl;
import in.itm.service.PayementService;
public class GPay implements PayementService 
{
	  public void payment(double  bal){
		 System.out.println("Payment of rupees "+bal +" done using gpay");
	  }
}
