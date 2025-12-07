package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] arr = str.toCharArray(); 
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println("Sorted characters: " + sorted);

	}

}
