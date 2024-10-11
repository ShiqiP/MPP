package Lab8.prob2;

import java.util.Comparator;

public class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}

	
	class InnerPriceCompartor implements Comparator<Product> {@Override
		public int compare(Product prod1, Product prod2) {
			if (prod1.getPrice()>prod2.getPrice())
				return  1;
			else if (prod1.getPrice()<prod2.getPrice())
				return  -1;
			return 0;
		}
	}
	
	static void sorter() {
		class localPriceCompartor implements Comparator<Product> {@Override
			public int compare(Product prod1, Product prod2) {
				if (prod1.getPrice()>prod2.getPrice())
					return  1;
				else if (prod1.getPrice()<prod2.getPrice())
					return  -1;
				return 0;
			}
		}
	}
	
}
