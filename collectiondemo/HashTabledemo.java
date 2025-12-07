package collectiondemo;

import java.util.Hashtable;
import java.util.Map;


public class HashTabledemo {

	public static void main(String[] args) {
		Map<Integer, String> mp = new Hashtable<>();
		mp.put(200, "Okay");
		mp.put(404, "Not Found");
		mp.put(500, "Error");
		mp.put(409, "Conflict");		
		
		for(Map.Entry<Integer, String> map:mp.entrySet()) {
			System.out.println("Key: "+map.getKey()+ "		Value: "+map.getValue());
		}
		System.out.println();
		mp.remove(200);
		for(Map.Entry<Integer, String> map:mp.entrySet()) {
			System.out.println("Key: "+map.getKey()+ "		Value: "+map.getValue());
		}
  
	}

}
