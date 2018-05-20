package state;

public class App {
	
	public static void main(String[] args) {
		ApartmentAutomat automat = new ApartmentAutomat(2);
		
		automat.submitApplication();
		automat.checkApplication();
		automat.processApplication();
		System.out.println();
		automat.submitApplication();
		automat.checkApplication();
		automat.processApplication();
		System.out.println();
		automat.submitApplication();
		automat.checkApplication();
		automat.processApplication();
		
	}
	
}
