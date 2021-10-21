
public class Student extends Person { // Student Is s Person: relation is: "IS A"
	private String dept;
	

	public Student(String dept ) {
		super("Fatma", "Karahan",23); // bad constructor
		this.dept=dept;
	}
	
	
	// better
	public Student(String name, String lastName, int age, String dept) {
		super(name,lastName,age); // for parent class constructor
		this.dept=dept;
	}
	
	
	public Student (Person p, String dept) {
		super(p.getName(),p.getLastName(),p.getAge(),p.getAddress());
		this.dept=dept;
	}
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	

	@Override
	public String toString() {
		
		//String info= getName()+" "+getLastName()+" "+getAge();
		
		// return info + " Student [dept=" + dept + "]";
		
		return super.toString()+ "Student [dept=" + dept + "]";
	}

	
	
	

}
