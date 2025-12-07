package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList();
		l1.add("100");
		l1.add("Java");
		System.out.println(l1);
		
		String s1 = (String) l1.get(1);
		System.out.println(s1);


	}

}
