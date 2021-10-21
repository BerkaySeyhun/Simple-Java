
public class MethodThrowException {
	
	public int mul(int a, int b) throws MyException {
		
		if(a ==0 || b==0) throw new MyException("one of variable is zero");
		return a*b;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public void callMul(int a, int b)throws MyException {
		
		System.out.println(mul(a,b));
	}
	
	
public void callMulTwo(int a, int b) {
		try {
			System.out.println(mul(a,b));
		}
		catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	
	
	public static void main(String[] args) {
		
		MethodThrowException m= new MethodThrowException();
		
		System.out.println(m.sum(20, 30));
		
		try {
		
			System.out.println(m.mul(10, 4));
			m.callMul(10, 4);
		}
		catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(m.sum(200, 300));
		
		System.out.println("Test again....");
		
		m.callMulTwo(0, 4);
		
		System.out.println(m.sum(2000, 300));
		
		System.out.println(" End of the main");
		
		
		
	}
	

}
