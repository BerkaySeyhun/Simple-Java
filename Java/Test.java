
public class Test {
	
	public static void main(String[] args) {
		Person p1 = new Person("Ali", "Kara", 23);
		System.out.println(p1);
		
		System.out.println("Test the Student class");
		
		Student s1= new Student("CMPE");
		System.out.println(s1.toString());
		
		
		Student s2= new Student("CE");
		System.out.println(s2.toString());
		
		
		Student s3= new Student("Ayse", "Karahan", 18, "EEEN");
		System.out.println(s3);
		
		Student s4= new Student(p1,"CE");
		System.out.println(s4);
		
		System.out.println("Test the graduate class");
		
		Graduate g1= new Graduate(p1, "CMPE", "PhD");
		System.out.println(g1);
		
		Graduate g2= new Graduate("Ahmet", "Çelik", 20, "CE", "Msc");
		System.out.println(g2);
		
		System.out.println("Test the Telephone class");
		Telephone t1= new Telephone("0555555", "021222222", "0212777777");
		System.out.println(t1);
		
		System.out.println("Test the address class");
		
		Address a1= new Address("Istanbul", 4444, t1);
		System.out.println(a1);
		
		Address a2= new Address("Ankara", 66666, new Telephone("0542666", "0216444", "0216777"));
		System.out.println(a2);
		
		System.out.println("Test the final version");
		
		Graduate g4= new Graduate(p1, "CMPE", "PhD");
		System.out.println(g4);
		
		Person p3= new Person("Erhan", "Çelik", 45, a1);
		Graduate g5= new Graduate(p3, "CE", "Msc");
		System.out.println(g5);
		
		// update objects
		System.out.println("update opject properties");
		g5.getAddress().setCity("Ankara");
		System.out.println(g5);
		
		g5.getAddress().getTelephone().setMobile("0542333333");
		System.out.println(g5);
		g5.setName("Gamze");
		
		System.out.println(g5);
		
		System.out.println("The fax of g5 is: ");
		
		System.out.println(g5.getAddress().getTelephone().getFax());
		
		
	}

}
