package deadLock;

public class Resource {
	private String name;
	private int resource;

	Resource(String name, int resource) {
		this.name = name;
		this.resource = resource;
	}

	String getName() {
		return name;
	}

	synchronized int doSome() {
		return resource;
	}

	synchronized void cooperate(Resource resource) {
		resource.doSome();
		System.out.println(this.name + " cooperate " + resource.name + " resource");
	}
}
