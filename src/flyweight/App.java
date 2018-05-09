package flyweight;

public class App {

	public static void main(String[] args) {
		
		String names[] = {"Adem", "John", "Dann"};
		int ids[] = {1,2,3};
		double points[] = {300,200,100};
		
		double average = 0;
		for(double d : points) {
			average += d;
		}
		
		average/=points.length;
		
		Student student = new Student(average);
		System.out.println("id  name  points  percentage");
		System.out.println("----------------------------");
		for(int i = 0;i < names.length;i++) {
			
			student.setInd(ids[i]);
			student.setName(names[i]);
			student.setPoints(points[i]);
			
			System.out.println("| " +student.getInd() + " | " + student.getName() + " | " + student.getPoints() +" | " + student.percentage() + " |");
			System.out.println("----------------------------");
		}
		
	}

}
