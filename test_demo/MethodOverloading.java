package test_demo;

class Student {
	int regNo = 001;
	
	void display() {
		System.out.println(regNo);
	}
	
	void display(String name) {
		System.out.println("Student name: "+name);
	}
	
	void display(int x) {
		System.out.println("single argument: "+x);
	}
	
	void display(int x, int y) {
		System.out.println("double args: "+x+","+y);
	}
	
	void display(int a, float b) {
		System.out.println("ordered: "+a+","+b);
	}
	
	void display(float a, int b) {
		System.out.println("ordered: "+a+","+b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.display();
		s1.display(50);
		s1.display("Ramesh");
		s1.display(10, 20);
		s1.display(12.3f, 95);
		s1.display(100, 2345.56f);

	}

}
