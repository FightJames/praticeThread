package deadLock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource1 = new Resource("resource1", 10);
		Resource resource2 = new Resource("resource2", 20);
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				resource1.cooperate(resource2);
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				resource2.cooperate(resource1);
			}
		});
		t1.start();
		t2.start();
	}

}
