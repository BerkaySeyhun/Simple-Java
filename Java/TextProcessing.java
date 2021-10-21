import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TextProcessing {
	
	
	// read from a file
	public void readData() {
		
		try {
			File file= new File("data.txt");
			Scanner scan= new Scanner(file);
			
			while(scan.hasNext()) {
				int k= scan.nextInt();
				if(k%2==0)
					System.out.println(k);
			}
			
			
		}
		catch (FileNotFoundException  e) {
			// TODO: handle exception
			System.out.println("We don't have such a file");
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
	
	// write to a file
	public void writeData () {
		
		File file= new File("bilgi.txt");
		try {
			PrintWriter writer = new  PrintWriter(file);
			writer.write("Istanbul");
			writer.flush();
			writer.close();
		}
		catch (FileNotFoundException  e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	// append to  a file
		public void writeDataAppend ()throws IOException {
			
			FileWriter file= new FileWriter("bilgi.txt",true);
			try {
				PrintWriter writer = new  PrintWriter(file);
				writer.write("Istanbul\n");
				writer.flush();
				writer.close();
			}
			catch (Exception  e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		
		// write odd numbers
				public void writeOddNumbers (int number,String fileName)throws IOException {
					
					FileWriter file= new FileWriter(fileName,true);
					try {
						PrintWriter writer = new  PrintWriter(file);
						if(number%2==1) {
							
							writer.write(number+"\n");
							writer.flush();
							writer.close();
						}
					}
					catch (Exception  e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
				}
				
			
				// copy odd numbers...
				public void readData(String fileSource,String fileTarget) {
					
					try {
						File file= new File(fileSource);
						Scanner scan= new Scanner(file);
						
						while(scan.hasNext()) {
							int k= scan.nextInt();
							writeOddNumbers(k, fileTarget);
						}
						
						
					}
					catch (FileNotFoundException  e) {
						// TODO: handle exception
						System.out.println("We don't have such a file");
					}
					catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
					
					catch (InputMismatchException e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
					}
					
					catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
					
					
				}
				
		
	public static void main(String[] args) {
		TextProcessing t= new TextProcessing();
		//t.readData();
		//t.writeData();
		try {
			//t.writeDataAppend();
			t.readData("data.txt", "oddnumber.txt");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of the main");
	}

}
