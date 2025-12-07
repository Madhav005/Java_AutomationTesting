package exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=2, c=0;
		int[] intArr = {1,2,3,4};
		try {
			c=a/b;
			System.out.println(intArr[4]);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero has occurred, please correct the code");
		}
		System.out.println("The value of c is: "+c);
	}

}
