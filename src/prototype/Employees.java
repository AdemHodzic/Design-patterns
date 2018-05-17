package prototype;

import java.util.LinkedList;
import java.util.List;

public class Employees implements Cloneable{
	
	private List<Employee> list;
	
	public Employees() {
		list = new LinkedList<>();
		list.add(new Employee("John"));
		list.add(new Employee("Amy"));
		list.add(new Employee("Sheldon"));
	}

	public Employees(List<Employee> list) {
		super();
		this.list = list;
	}

	public List<Employee> getList() {
		return this.list;
	}
	
	@Override
	public Object clone() {
		List<Employee> tempList = new LinkedList<>();
		tempList.addAll(this.list);
		return new Employees(tempList);
	}
	
	public void getAllEmployees() {
		System.out.println();
		for(Employee e : this.list) {
			System.out.println(e.getName() + "\t\t" + e.getId());
		}
		System.out.println();
	}
}
