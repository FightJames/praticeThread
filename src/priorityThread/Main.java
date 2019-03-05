package priorityThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread p1 = new PriorityThread("p1");
		PriorityThread p2 = new PriorityThread("p2");
		PriorityThread p3 = new PriorityThread("p3");
		PriorityThread p4 = new PriorityThread("p4");
		p1.setPriority(Thread.MAX_PRIORITY);// It will be more possibility to be executed.
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		p4.setPriority(8);// Priority depends on OS. So you cant use actually number. Maybe you will get
							// wrong result.
		System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}

}
