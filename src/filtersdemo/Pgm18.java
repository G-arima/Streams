package filtersdemo;

import java.util.ArrayList;
import java.util.List;

class Products{
	int id;
	String name;
	double price;
	
	Products(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Pgm18 

{
	

	public static void main(String[] args) 
	{
	//Products Costing Less Than ₹1000
		List<Products> productList=new ArrayList<>();
		productList.add(new Products(101,"Baby clothes cleaning liquid detergent",350.50));
		productList.add(new Products(102,"Coconut oil for baby skin massage",250.55));
		productList.add(new Products(103,"Tummy Time roller",350.90));
		productList.add(new Products(104,"High Chair",8500.99));
		productList.add(new Products(105,"Bed rails",5600.88));
		productList.add(new Products(106,"Women co-ord set",990.90));
		productList.stream().filter(p->p.price<1000).forEach(p->System.out.println(p.price));
		

	}

}
