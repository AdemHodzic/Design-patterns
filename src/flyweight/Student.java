package flyweight;

public class Student {
	
	private String name;
	private int ind;
	private double points;
	private double averagePoints;
	
	public Student(double averagePoints) {
		this.averagePoints = averagePoints;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInd() {
		return ind;
	}
	public void setInd(int ind) {
		this.ind = ind;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	
	public double percentage() {
		return (this.points/this.averagePoints) * 100; 
	}
	
	
}
