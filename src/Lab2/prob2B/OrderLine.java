package Lab2.prob2B;
import java.time.LocalDate;

public class OrderLine {
private int orderLineNum;
private double price;
private int qty;
private Order order;

	OrderLine(Order order){
		this.order = order;
	}

}
