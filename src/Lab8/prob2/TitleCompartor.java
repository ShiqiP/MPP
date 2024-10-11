package prob2;

import java.util.Comparator;

public class TitleCompartor implements Comparator<Product> {
	
	@Override
	public int compare(Product prod1, Product prod2) {
	
	return prod1.getTitle().compareTo(prod2.getTitle());
}

}
