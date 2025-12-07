package test_demo;

abstract class Mobile{
	
	abstract void calling();
	
	void browsing() {
		System.out.println("Browsing in mobile...s");
	}
	
}

class Iphone extends Mobile{
	void calling() {
		System.out.println("Iphone calling...");
	}
	void browsing() {
		System.out.println("Iphone browsing...");
	}
}


public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile apple = new Iphone();
		apple.calling();
		apple.browsing();

	}

}
