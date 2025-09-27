/*
    OOP concepts:
	-------------
	Inheritance:-  [very very important]
	-----------------------------------
	[extends] keyword
	Reusability
	
*/

class Card //Parent -Base - Super
{	
	long cardNumber;
	
	void debitBalance(){
		System.out.println("Parent");
	}
}
class DebitCard  extends Card //Child -Derived - SubClass
{
	 double availableBalance;
	 void checkBalance(){
		System.out.println("Debit Child");
	 }
}
class CreditCard extends Card
{
	double availableCreditLimit;
	void checkBalance(){
		System.out.println("Credit Child");
	}
}

class  InheritanceDemo1
{
	public static void main(String[] args) 
	{
		//CreditCard  c1=new Card();// Card cannot be converted to //CreditCard
		
		Card  c1=new CreditCard();
		CreditCard  c2=(CreditCard)c1;//Card cannot be converted to CreditCard
	}
}
