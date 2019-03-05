package futrureTask;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
	Thread thread;

	Task(Thread in) {
		this.thread = in;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(thread.getState() + "  " + thread.isAlive());
		}

		return "End";
	}

}
