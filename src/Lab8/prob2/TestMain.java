package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {
	
	public static void main(String[] args)
	{
		Product p1 = new Product("Book", 20.0, 2022);
		Product p2 = new Product("Pen", 3.0, 2023);
		Product p3 = new Product("Sharpener", 2.0, 2024);
		Product p4 = new Product("Book", 10.0, 2024);
		

		List<Product> supplies = new ArrayList<>();
		supplies.add(p1);
		supplies.add(p2);
		supplies.add(p3);
		supplies.add(p4);
		
		
		
		////////    Solution of (a)   ////////////////
		
		System.out.println("Sorting using Price Comparator class (dedicated class): ");
		Collections.sort(supplies, new PriceCompartor());
		supplies.forEach(x->System.out.println(x.toString()));
		System.out.println("---------------------");
		
		Collections.shuffle(supplies);
		
		
		System.out.println("Sorting using Price Comparator class (Inner class): ");
		Collections.sort(supplies, p1.new InnerPriceCompartor());
		supplies.forEach(x->System.out.println(x.toString()));
		System.out.println("---------------------");
		
		
		
		////////     Solution of (b)   ////////////////
		
		System.out.println("Sorting using Title Comparator class (dedicated class): ");
		Collections.sort(supplies, new TitleCompartor());
		supplies.forEach(x->System.out.println(x.toString()));
		System.out.println("---------------------");
		
		
		
		////////     Solution of (c)   ////////////////
		
		
		System.out.println("Sorting using Price & Title with ONE Comparator (\" By Title \"): ");
		
		supplies  = mysort(supplies,SortMethod.BYTITLE);
		supplies.forEach(x->System.out.println(x.toString()));
		System.out.println("---------------------");
		
		
		System.out.println("Sorting using Price & Title with ONE Comparator (\" By Price \"): ");
		
		supplies  = mysort(supplies,SortMethod.BYPRICE);
		supplies.forEach(x->System.out.println(x.toString()));
		System.out.println("---------------------");
		
		
		
		////////      Solution of (d)   ////////////////
		
		System.out.println("Sorting using Title & Model (Using Lambda \"Title First \"): ");
		Collections.sort(supplies, (e1,e2)->{
			if (e1.getTitle().compareTo(e2.getTitle())==0) 
				return e1.getModel()<e2.getModel() ?  -1:1;
			else
				return e1.getTitle().compareTo(e2.getTitle());		
		});	
		supplies.forEach(x->System.out.println(x.toString()));
		System.out.println("---------------------");
	
		
	}
	
	
	
	enum SortMethod {BYPRICE, BYTITLE};
	
	public static List<Product> mysort(List<Product> products, SortMethod method) {

		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product e1, Product e2) {
				if(method == SortMethod.BYTITLE) {
					return e1.getTitle().compareTo(e2.getTitle());
				} else {
					if(e1.getPrice() == e2.getPrice()) return 0;
					else if(e1.getPrice() < e2.getPrice()) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(products, new ProductComparator());
		return products;
	}
	
}
