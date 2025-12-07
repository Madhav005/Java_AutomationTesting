package collection_assignment;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<>();
		    vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Cherry");
	        vector.add("Mango");
	        vector.add(2, "Orange");
	        
	        System.out.println("Vector elements: " + vector);

	        vector.remove("Banana");
	        System.out.println("After removing 'Banana': " + vector);

	        System.out.println("Size of Vector: " + vector.size());
	}

}
