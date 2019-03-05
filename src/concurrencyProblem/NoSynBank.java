package concurrencyProblem;

public class NoSynBank extends Thread {
	private volatile BankAccount bankAccount;
	// positive : save money
	// negative : draw money
	private double money;
	int delayI = 0;

	NoSynBank(String name, BankAccount ba, double money, int delay) {
		super(name);
		this.bankAccount = ba;
		this.money = money;
		delayI = delay;
	}

	public void run() {
		synchronized (this.bankAccount) {
			double d = this.bankAccount.getBalance();
			System.out.println(this.getName() + " origin balance " + d + "  " + this.bankAccount);
			if ((money < 0) && (d < (Math.abs(money)))) {
				System.out.println(this.getName() + " fail Depositive is not enough");
				return;
			} else {
				d += money;
				System.out.println(this.getName() + " Success Depositive is " + d);
				this.bankAccount.setBalance(d);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
