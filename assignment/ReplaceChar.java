package assignment;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter character to replace:");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter new character:");
        char newChar = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == oldChar)
            {	
                result += newChar;
            }    
            else
            {        
                result += str.charAt(i);
            }   
        }
        System.out.println("Result: " + result);

	}

}
