package demo;

public class Account {
	long accNumber;
	double bal;

	public Account(long accNumber, double bal) {
		this.accNumber = accNumber;
		this.bal = bal;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public long getAccNumber() {
		return accNumber;
	}

	
}
