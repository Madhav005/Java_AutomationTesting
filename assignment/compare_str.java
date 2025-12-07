package assignment;

import java.util.Scanner;

public class compare_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s1=sc.nextLine();
		System.out.print("Enter a String:");
		String s2=sc.nextLine();
		System.out.println("equals() result: "+s1.equals(s2));
		System.out.println("compareTo() result: "+s1.compareTo(s2));

	}

}
