
public class Address { // Address can have a phone number. "HAS A"
	
	
	private String city;
	private int postCode;
	private Telephone telephone;  // has a relation. 
	
	public Address(String city, int postCode, Telephone telephone) {
		super();
		this.city = city;
		this.postCode = postCode;
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public Telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", postCode=" + postCode + ", telephone=" + telephone + "]";
	}
	
	
	
	
	
	

}
