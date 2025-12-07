package assignment;

import java.util.Scanner;

public class ReplaceSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
	     String str = sc.nextLine();
	     System.out.println("Enter substring to replace:");
	     String oldSub = sc.nextLine();
	     System.out.println("Enter new substring:");
	     String newSub = sc.nextLine();
	     
	     String result = str.replace(oldSub, newSub);
	     System.out.println("Result: " + result);

	}

}
