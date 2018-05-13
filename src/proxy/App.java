package proxy;

public class App {
	
	public static void main(String[] args) {
		
		HugeObjectInterface obj = new HugeObjectProxy("Huuuuuuuuge string", 1234567890);
		System.out.println("Huge String: " + obj.getHugeString());
		System.out.println("Huge Number: " + obj.getHugeNumber());
	}
	
}
