package collectiondemo;

import java.util.HashMap;
import java.util.Map;


public class HashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		mp.put(200, "Okay");
		mp.put(404, "Not Found");
		mp.put(500, "Error");
		mp.put(409, "Conflict");
		mp.put(null, null);
		System.out.println(mp);
		mp.remove(200);
		System.out.println(mp);
  
	}

}
