package in.itm.billing;
import in.itm.service.PayementService;
public class Biller
{
	public  static void pay(PayementService ps,double amt){
		ps.payment(amt);
	}
}