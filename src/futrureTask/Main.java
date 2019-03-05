package futrureTask;

import java.util.concurrent.FutureTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FutureTask<String> task = new FutureTask<String>(new Task(Thread.currentThread()));

		new Thread(task, "sub thread").start();
		try {
			System.out.println(Thread.currentThread().getState());
			// use this, main thread will wait sub thread
			System.out.println(task.get());
			System.out.println(Thread.currentThread().getState());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
