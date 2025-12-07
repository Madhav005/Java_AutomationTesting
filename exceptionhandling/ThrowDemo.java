package exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=2, c=0;
		try {
			c=a/b;
			
		throw new ArrayIndexOutOfBoundsException();
		}
		
		catch(ArithmeticException ac) {
			System.out.println("Divided by zero not possible");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Value of c: "+c);
		
		
		
	}

}
