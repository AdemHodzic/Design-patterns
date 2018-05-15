package composite;

public class App {
	
	public static void main(String[] args) {
		Corparation firma = new Corparation("Firma");
		
		Division hr = new Division("HR");
		hr.add(new Worker("Amy", hr));
		hr.add(new Worker("Lenard", hr));
		hr.add(new Worker("Shelly", hr));
		
		Division sales = new Division("Sales");
		sales.add(new Worker("Ted", sales));
		sales.add(new Worker("Richard", sales));
		
		Worker hobo = new Worker("Alien in the vents");
		
		firma.add(hr);
		firma.add(sales);
		firma.add(hobo);
		
		firma.print();
	}
}
