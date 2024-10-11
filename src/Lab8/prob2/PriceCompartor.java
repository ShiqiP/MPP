package prob2;

import java.util.Comparator;

public class PriceCompartor implements Comparator<Product> {
	
	@Override
	public int compare(Product prod1, Product prod2) {
		if (prod1.getPrice()>prod2.getPrice())
			return  1;
		else if (prod1.getPrice()<prod2.getPrice())
			return  -1;

		return 0;
}

}
