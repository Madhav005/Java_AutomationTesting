package assignment;

import java.util.Scanner;

public class remove_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=sc.nextLine();
		String out="";

		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(out.indexOf(c)==-1)
		        out+=c;
		}

		System.out.println(out);

	}

}
