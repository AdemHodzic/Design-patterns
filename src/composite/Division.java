package composite;

import java.util.Iterator;

public class Division extends Corparate{
	
	private String name;
	private Corparate[] corparates = new Corparate[100];
	private int index = 0;
	
	
	public Division(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public Iterator<Corparate> iterator() {
		return new DivisionIterator(corparates);
	}

	@Override
	public void add(Corparate corparate) {
		this.corparates[index++] = corparate;
	}

	@Override
	public void print() {
		Iterator<Corparate> iterator = iterator();
		while(iterator.hasNext()) {
			Corparate temp = iterator.next();
			temp.print();
		}
	}

}
