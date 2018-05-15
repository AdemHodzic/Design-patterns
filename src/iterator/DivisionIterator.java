package iterator;

import java.util.Iterator;

public class DivisionIterator<E> implements Iterator<E>{
	
	private E[] workers;
	private int index = 0;
	
	public DivisionIterator(E[] workers) {
		this.workers = workers;
	}
	
	
	public boolean hasNext() {
		if(index != workers.length && workers[index]!=null) 
			return true;
		return false;
	}


	@Override
	public E next() {
		return workers[index++];
	}
	
	

}