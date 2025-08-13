package in.itm.factory;
import in.itm.service.impl.*;
import in.itm.service.PayementService;
public class PaymentFactory 
{
	public static PayementService ps;
	public static PayementService getObject(String  mode){
		if (mode.equals("debit"))
		{
			ps= new DebitCard();
		}
		else if(mode.equals("gpay")){
			ps=new GPay();
		}
		else if(mode.equals("ppay")){
			ps=new PhonePay();
		}
		else{
			ps=null;
		}
		return ps;
	}
}
