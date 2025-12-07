package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class rotate_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total the number of elements:");
		int d=sc.nextInt();
		int[] a=new int[d];
		System.out.print("Enter the elements:");
		for(int i=0;i<d;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("No. of times to rotate:");
		int m=sc.nextInt();

		for(int r=0;r<m;r++){
		    int temp=a[0];
		    for(int i=0;i<a.length-1;i++)
		        a[i]=a[i+1];
		    a[a.length-1]=temp;
		}

		System.out.println(Arrays.toString(a));

	}

}
