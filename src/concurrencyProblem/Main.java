package concurrencyProblem;

public class Main {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("2000363", 5000d);
		NoSynBank t1 = new NoSynBank("t1", myAccount, -3000d,5000);
		NoSynBank t2 = new NoSynBank("t2", myAccount, -3000d,4000);
		NoSynBank t3 = new NoSynBank("t3", myAccount, 1000d,3000);
		NoSynBank t4 = new NoSynBank("t4", myAccount, -2000d,2000);
		NoSynBank t5 = new NoSynBank("t5", myAccount, 2000d,1000);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Account " + myAccount.getBankNo() + " ,Depositive " + myAccount.getBalance());
	}

}
