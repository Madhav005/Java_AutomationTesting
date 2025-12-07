package assignment;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element to search: ");
		int key=sc.nextInt();
		int low=0,high=n-1;
		boolean found=false;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.print("Found at "+mid);
				found=true;
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		if(!found) {
			System.out.print("Element not found");
		}

	}

}
