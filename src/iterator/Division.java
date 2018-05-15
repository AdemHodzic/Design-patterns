package iterator;

import java.util.Iterator;

public class Division {
	
	private String divisionName;
	private int index = 0;
	private Worker[] workers;
	
	public Division(String divisionName) {
		this.divisionName = divisionName;
		this.workers = new Worker[100];
	}
	
	public void add(Worker worker) {
		this.workers[index++] = worker;
	}
	
	public Iterator<Worker> iterator() {
		return new DivisionIterator<Worker>(workers);
	}
	
	public String getName() {
		return this.divisionName;
	}
	
	
	
	
	
	
}
