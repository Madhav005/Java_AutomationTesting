package exceptionhandling;

public class FInallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {1,2,3,4};
		try {
		
			System.out.println(intArr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bound in array");
		}
		finally {
			System.out.println("All resources are closed");
		}
	}

}
