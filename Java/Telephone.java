
public class Telephone {
	
	private String mobile;
	private String home;
	private String fax;
	
	public Telephone(String mobile, String home, String fax) {
		//super();
		this.mobile = mobile;
		this.home = home;
		this.fax = fax;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	
	@Override
	public String toString() {
		return "Telephone [mobile=" + mobile + ", home=" + home + ", fax=" + fax + "]";
	}
	
	
	
	
	

}
