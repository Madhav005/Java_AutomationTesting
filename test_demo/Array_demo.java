package test_demo;

import java.util.Scanner;

public class Array_demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element at "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}   
		System.out.print('[');
		for (int i = 0; i < n; i++) {
			
		    if (i > 0) System.out.print(", ");
		    System.out.print(arr[i]);
		}
		System.out.println(']');
		boolean flag =false;
		int key=30;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println("Element 30 found at position "+(i+1));
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Element not found.");
		}
		sc.close();
	}

}
