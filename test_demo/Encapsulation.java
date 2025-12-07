package test_demo;


class BankAccount {
	private long accNo;
	private String accName;
	private float accBalance;
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount();
		acc1.setAccNo(2432156);
		System.out.println("Bank account number: " + acc1.getAccNo());

	}

}
