package concurrencyProblem;

public class BankAccount {
	// bank account
	private String bankNo;
	private double balance;

	BankAccount(String bankNo, double balance) {
		this.bankNo = bankNo;
		this.balance = balance;
	}

	public void setBankNo(String in) {
		this.bankNo = in;
	}

	public void setBalance(double in) {
		System.out.println("setBalance " + in);
		this.balance = in;
		System.out.println("setBalance " + this.balance);
	}

	public String getBankNo() {
		return bankNo;
	}

	public double getBalance() {
		return balance;
	}
}
