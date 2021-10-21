
public class Worker extends Person {
	
	private int salary;

	public Worker(String name, String lastName, int age, int salary) {
		super(name, lastName, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+ "Worker [salary=" + salary + "]";
	}
	
	
	
	
	
	

}
