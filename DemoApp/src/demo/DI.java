package demo;

public class DI {

	public static void main(String[] args) {

		Account account = new Account(1111, 1000.0);

		Customer customer = new Customer("Raja", account);
		
		System.out.println(customer.account.getBal());
		
		
	}

}
