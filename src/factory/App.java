package factory;

public class App {
	
	public static void main(String[] args) {
		ConnectionFactoryImpl factory;
		
		factory = new ConnectionFactoryImpl("oracle");
		System.out.println(factory.createConntection().description());
		
		factory = new ConnectionFactoryImpl("sqlserver");
		System.out.println(factory.createConntection().description());
		
		factory = new ConnectionFactoryImpl("mysql");
		System.out.println(factory.createConntection().description());
		
	}
	
}
