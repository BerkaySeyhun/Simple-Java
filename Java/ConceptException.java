
public class ConceptException {
	
	public static void main(String[] args) {
		
		int d[]= {1,2,3,4,5};
		
		try {
			
			int p= Integer.parseInt("25");
		
			for(int i=0;i<6;i++)
				System.out.println(d[i]);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("We have error in Exception block...");
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("End of the main program...");
				
	}

}
