package collectiondemo;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s= new TreeSet<>();
		s.add(3);
		s.add(2);
		s.add(56);
		s.add(2);
		s.add(4);
		
		for(float fl:s) {
			System.out.println(fl);
		}
	}

}
