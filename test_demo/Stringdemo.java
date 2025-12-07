package test_demo;

public class Stringdemo {

	public static void main(String[] args) {
		
		String s1= "Selenium";
		s1 = s1+" tool";
		System.out.println(s1);
        
		String[] s2 = s1.split("");
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+", ");
		}
		
	}

}
