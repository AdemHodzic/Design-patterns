package composite;

import java.util.Iterator;

public class Worker extends Corparate{

	private String name;
	private Division division;
	
	public Worker(String name, Division division) {
		super();
		this.name = name;
		this.division = division;
	}
	
	public Worker(String name) {
		super();
		this.name = name;
		this.division = new Division("None");
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Iterator<Corparate> iterator() {
		return new WorkerIterator(this);
	}

	@Override
	public void add(Corparate corparate) {
		
	}

	@Override
	public void print() {
		System.out.println("\nName: " + this.name
							+"\nDivision: " + this.division.getName());
	}

}
