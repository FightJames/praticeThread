package join;

public class JoinThread extends Thread {
	Thread thread;

	JoinThread(Thread thread) {
		this.thread = thread;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(thread.getState());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
