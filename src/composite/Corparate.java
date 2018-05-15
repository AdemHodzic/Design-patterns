package composite;

import java.util.Iterator;

public abstract class Corparate {

	public abstract String getName();
	public abstract Iterator<Corparate> iterator();
	public abstract void add(Corparate corparate);
	public abstract void print();
}
