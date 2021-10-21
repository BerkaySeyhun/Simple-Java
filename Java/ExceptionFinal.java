
public class ExceptionFinal {
	
	public static void main(String[] args) {
		
		try {
			double p= Double.parseDouble("2.55");
			System.out.println(p*2);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally { // 0ptional
			
			System.out.println("This is the finally block");
		}
		
		System.out.println("End of the main");
	}

}
