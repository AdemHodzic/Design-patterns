package iterator;

public class Worker {
	
	private String name;
	private int id;
	
	private static int counter;
	
	public Worker(String name) {
		this.name = name;
		this.id = counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name
				+ "\nID: " + this.id;
	}
	
	
}
