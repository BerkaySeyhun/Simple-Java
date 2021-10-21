
public class Graduate extends Student{ // GraduateSutdunt is a Student: relation is: "IS A"
	
	private String degree;

	public Graduate(String name, String lastName, int age, String dept, String degree) {
		super(name, lastName, age, dept);
		this.degree = degree;
	}

	public Graduate(Person p, String dept, String degree) {
		super(p, dept);
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Graduate [degree=" + degree + "]";
	}

	
	
	
	
	

}
