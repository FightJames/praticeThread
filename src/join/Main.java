package join;

public class Main {

	public static void main(String[] argu) {
		JoinThread joinThread = new JoinThread(Thread.currentThread());
		joinThread.start();
		System.out.println("Main start " + Thread.currentThread().getState());
		try {
			joinThread.join();
			System.out.println("Main End");
			System.out.println("JoinThread " + joinThread.getState());
			System.out.println("Try to reStart joinThread");
			// you cant restart thread which is dead.
			joinThread.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
