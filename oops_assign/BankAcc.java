package oops_assign;

class Bank {
    protected String accountNo;
    protected double balance;

    public Bank(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        System.out.println("Account Created: " + accountNo + " | Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends Bank {
    private double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
        System.out.println("Savings Account Created | Interest Rate: " + interestRate + "%");
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: " + interest + " | New Balance: " + balance);
    }
}

class SalaryAccount extends Bank{
    private double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
        System.out.println("Salary Account Created | Monthly Salary: " + monthlySalary);
    }

    public void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary Credited: " + monthlySalary + " | New Balance: " + balance);
    }
}

public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SavingsAccount sa = new SavingsAccount("IB001", 30000, 5);
	        sa.deposit(1000);
	        sa.addInterest();
	        sa.withdraw(2000);

	        SalaryAccount salAcc = new SalaryAccount("IB002", 3000, 25000);
	        salAcc.creditSalary();
	        salAcc.withdraw(5000);

	}

}
