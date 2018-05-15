package iterator;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		
		Division salesDivision = new Division("Sales");
		salesDivision.add(new Worker("Amy"));
		salesDivision.add(new Worker("Lenard"));
		salesDivision.add(new Worker("Sheldon"));
		salesDivision.add(new Worker("Penny"));
		
		Iterator<Worker> iterator = salesDivision.iterator();
		
		while(iterator.hasNext()) {
			Worker worker = iterator.next();
			System.out.println(worker.toString());
		}
		
	}

}
