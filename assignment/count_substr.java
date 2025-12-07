package assignment;

import java.util.Scanner;

public class count_substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		System.out.println("Enter a String:");
		String sub=sc.nextLine();
		int count=0;

		for(int i=0;i<=s.length()-sub.length();i++){
		    if(s.substring(i, i+sub.length()).equals(sub))
		        count++;
		}

		System.out.println(count);

	}

}
