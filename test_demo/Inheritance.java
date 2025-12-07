package test_demo;

class Worker{
	int empNo = 100;
	String empName = "Raju";
	
	void displayEmployee() {
		System.out.println("Emp No: "+empNo+", Emp Name: "+empName);
	}
}

class Manager extends Worker {
	float variablePay = 35000.45f;
	
	void displayManager() {
		System.out.println("Emp No: "+empNo+", Emp Name: "+empName+", Variable Pay: "+variablePay);
	}
}

public class Inheritance {
 
    public static void main(String[] args) {
    	Worker emp1 = new Worker();
    	Manager emp2 = new Manager();
    	emp1.displayEmployee();
    	emp2.displayManager();
    	
    }
}
