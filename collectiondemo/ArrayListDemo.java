package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<>();
		
		li.add("Guna");
		li.add("Senthil");
		li.add("Rajan");
		li.add("Anbu");
		li.add("Guna");
		
		System.out.println("The objects in the list are: ");
		for(String s:li) {
			System.out.println(s);
		}
		System.out.println();
		li.add(2,"Dhamu");
		System.out.println("The objects in the list after adding: ");
		for(String s:li) {
			System.out.println(s);
		}
		System.out.println();
		
		li.remove("Guna");
		System.out.println("The objects in the list after deleting: ");
		for(String s:li) {
			System.out.println(s);
		}
		
		

	}

}
