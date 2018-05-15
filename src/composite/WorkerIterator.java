package composite;

import java.util.Iterator;

public class WorkerIterator implements Iterator<Corparate> {

	private Worker worker;
	
	
	
	public WorkerIterator(Worker worker) {
		super();
		this.worker = worker;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Corparate next() {
		return this.worker;
	}

}
