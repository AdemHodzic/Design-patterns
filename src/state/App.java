package state;

public class App {
	
	public static void main(String[] args) {
		ApartmentAutomat automat = new ApartmentAutomat(2);
		automat.submitApplication();
		automat.checkApplication();
		automat.processApplication();
		
		ApartmentAutomat full = new ApartmentAutomat(0);
		full.submitApplication();
		full.checkApplication();
		full.processApplication();
		
	}
	
}
