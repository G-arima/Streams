package filtersdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	double price;
	 
	Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class Pgm4_FilterDemo4 {

	public static void main(String[] args) {
		Product p1=new Product(1,"Dell Laptop",27500);
		Product p2=new Product(2,"Lenovo Laptop",25500);
		Product p3=new Product(3,"Asus Laptop",20000);
		Product p4=new Product(4,"Apple Laptop",90000);
		List<Product> productList=new ArrayList();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		//Filter the above collection based upon the price
		//Scenario is to filter only the product with price greater than 25000
		productList.stream()
		.filter(p->p.price>25000)//here we are taking the object reference and filtering with price greater than 25000
		.forEach(pr->System.out.println(pr.price));//here we are iterating based on the prices
		
	}

}
