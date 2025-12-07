package collectiondemo;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new TreeMap<>();
		mp.put(200, "Okay");
		mp.put(404, "Not Found");
		mp.put(500, "Error");
		mp.put(409, "Conflict");
		mp.put(200, "ok");
		
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
