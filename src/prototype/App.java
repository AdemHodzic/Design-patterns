package prototype;

public class App {
	
	public static void main(String[] args) {
		Employees database1 = new Employees();
		Employees database2 = (Employees)database1.clone();
		Employees database3 = (Employees)database1.clone();
		
		database2.getList().add(new Employee("Howard"));
		database3.getList().add(new Employee("Gambino"));
		
		database1.getAllEmployees();
		database2.getAllEmployees();
		database3.getAllEmployees();

	}
	
}
