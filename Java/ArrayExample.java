import java.util.Random;

public class ArrayExample {
	private int size;
	private int myData[];
	private Random ran;
	
	public ArrayExample(int size) {
		// TODO Auto-generated constructor stub
		this.size=size;
		myData= new int[size];
		ran= new Random();
		initArray();// call the method to initialize the array
				
	}
	
	public void initArray() {
		for(int i=0;i<size;i++)
			myData[i]= ran.nextInt(100);
	}
	
	public void printArray() {
		for(int k:myData)
			System.out.print(k+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayExample e= new ArrayExample(20);
		e.printArray();
	}
	

}
