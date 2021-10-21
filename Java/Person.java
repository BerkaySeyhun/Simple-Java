
public class Person  {
	
	private String name;
	private String lastName;
	private int age;
	
	private Address address;
	
	
	public Person(String name, String lastName, int age) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

public Person(String name, String lastName, int age, Address address) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address=address;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "\n"
				+ "Address: "+address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
