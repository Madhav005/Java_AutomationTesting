package assignment;

import java.util.Scanner;

public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String a=sc.nextLine();
		String[] word=a.split(" ");
		System.out.print("The count is: "+word.length);

	}

}
