package assignment;

public class char_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="banana";
		char ch='a';
		int count=0;

		for(int i=0;i<s.length();i++)
		    if(s.charAt(i)==ch) count++;

		System.out.println(count);
	}

}
