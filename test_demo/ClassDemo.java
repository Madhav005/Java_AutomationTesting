package test_demo;


class Employee {
	int empID=1000;
	String empName="Madhav";
	float empSalary=55000.55f;
	
	Employee(int empID, String empName, float empSalary){
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	
	void displayEmployeeDetails() {
		System.out.println("Emp ID: "+empID+", Employee Name: "+empName+", Employee Salary: "+empSalary);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "Raju", 20000);
		System.out.println(emp1.empName);
		emp1.displayEmployeeDetails();

	}

}
