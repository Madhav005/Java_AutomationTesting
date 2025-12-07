package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Float> s= new HashSet<>();
		s.add(3.14f);
		s.add(2.5f);
		s.add(56.2f);
		s.add(2.5f);
		s.add(4.2f);
		
		for(float fl:s) {
			System.out.println(fl);
		}
	}

}
