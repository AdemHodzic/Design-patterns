package composite;

import java.util.Iterator;

public class Corparation extends Corparate{

	private String name;
	private Corparate[] corporates = new Corparate[100];
	private int index = 0;
	
	public Corparation(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Iterator<Corparate> iterator() {
		return new DivisionIterator(corporates);
	}

	@Override
	public void add(Corparate corparate) {
		corporates[index++] = corparate;
	}

	@Override
	public void print() {
		//Broken DRY principle
		Iterator<Corparate> iterator = iterator();
		
		while(iterator.hasNext()) {
			iterator.next().print();
		}
	}

}
