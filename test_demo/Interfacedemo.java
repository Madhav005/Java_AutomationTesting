package test_demo;


class Printer implements Printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(printerName+" is printing...");
		
	}
	
		
}

public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p1 = new Printer();
		p1.print();
		

	}

}
