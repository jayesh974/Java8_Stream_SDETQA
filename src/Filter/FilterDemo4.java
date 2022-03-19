package Filter;

import java.util.ArrayList;
import java.util.List;



	class Product {

		int id;
		String name;
		int price;

		public Product(int id, String name, int price) 
		{
			this.id = id;
			this.name = name;
			this.price = price;

		}

	}

	public class FilterDemo4 { 
		
	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Lenovo Laptop", 35000));
		productsList.add(new Product(3, "Dell Laptop", 45000));
		productsList.add(new Product(4, "Apple Laptop", 85000));
	
		productsList.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));

	}
}
