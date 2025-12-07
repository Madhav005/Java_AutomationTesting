package test_demo;

class Product{
	String name;
	float price;
	
	Product(){
		name="TV";
		price=23000.50f;
	}
	
	Product(String name, float price){
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println("Product name: "+name+"\tPrice: "+price);
	}
}

public class Constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.display();
		Product p1 = new Product("Mobile", 12000);
		p1.display();
		
		

	}

}
