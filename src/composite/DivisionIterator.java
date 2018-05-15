package composite;

import java.util.Iterator;

public class DivisionIterator implements Iterator<Corparate> {

	private Corparate[] corparates;
	private int location = 0;
	
	public DivisionIterator(Corparate[] corparates) {
		super();
		this.corparates = corparates;
	}

	@Override
	public boolean hasNext() {
		if(location != corparates.length && corparates[location] != null) 
			return true;
		return false;
	}

	@Override
	public Corparate next() {
		return corparates[location++];
	}

}
