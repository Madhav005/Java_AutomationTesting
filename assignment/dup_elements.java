package assignment;

import java.util.Scanner;

public class dup_elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The duplicate elements are:");

        for (int i = 0; i < n; i++) {
            boolean dup = false;

          
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    dup = true;
                    break;  
                }
            }

     
            if (dup) {
                System.out.println(arr[i]);
            }
        }

    }
}
