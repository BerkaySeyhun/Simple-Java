
public class TableWithMethod {
	
	public void printTable(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	/* input
	 *  1   3     4   4   5
	 *  2   3     5   1   4
	 *  1   2     3   4   3
	 */
	//input
	// a= 10,20,30,40,50
	// return
	/*
	 *  10   60  130  160  250
	 *  .................
	 *  ...................
	 */
	
	
	public int [][] multiply(int a[][], int []p) {
		int r=a.length;
		int c=a[0].length;
		int [][] temp=  new int [r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				temp[i][j]=a[i][j]*p[j];
		}
		return temp; // just write array name;
	}
	

	
	
	/* input
	 *  1   3     4  
	 *  2   3     5  
	 *  1   2     3  
	 */
	
	// ouput
	/*
	 * 1
	 * 1  3
	 * 1  2  3
	 */
	// row and column are equal
	public void printLowerElements(int [][]table) {
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[0].length;j++) {
				if(j<=i)
				System.out.print (table[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	// row and column are equal
		public void printDiagonal(int [][]table) {
			for(int i=0;i<table.length;i++) {
				for(int j=0;j<table[0].length;j++) {
					if(j==i)
					System.out.print (table[i][j]+" ");
				}
				System.out.println();
			}
		}
		

		// row and column are equal
			public void printDiagonal2(int [][]table) {
				//for(int i=0;i<table.length;i++) {
					for(int j=0;j<table.length;j++) {
						//if(j==i)
						System.out.print (table[j][j]+" ");
					//}
					System.out.println();
				}
			}
			
			
	public static void main(String[] args) {
		
		TableWithMethod t= new TableWithMethod();
		int p[][]= {{1,2,3},{3,4,5}};
		t.printTable(p);
		
		System.out.println("pritn p2");
		int p2[][]= {{1,2,3,5,6},{3,4,5,6,7}, {1,-1,-3,-5,-6}};
		t.printTable(p2);
		
		System.out.println("test multiply");
		int k[]= {10,20,30,40,50};
		
		t.printTable(t.multiply(p2, k));
		
		System.out.println("test pritn lower");
		int p3[][]= {{1,2,3},{3,4,5}, {10,20,30}};
		t.printLowerElements(p3);
		
		

		System.out.println("test pritn diagonal");
		
		t.printDiagonal(p3);
		
		

		System.out.println("test pritn diagonal2");
		
		t.printDiagonal2(p3);
		
	}
}
