package exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingAge {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if (age < 18) {
            throw new InvalidAgeException("Candidate is not eligible to vote");
        } else {
            System.out.println("Candidate is eligible to vote");
        }
		

	}

}
