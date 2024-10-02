package Lab2.prob2B;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Order {
private String ordernum;
private LocalDate date;
private List<OrderLine> orderLine;

	Order(){
		orderLine = new ArrayList<OrderLine>();
	}
	
	public void addOrderLine()
	{
		orderLine.add(new OrderLine(this));
	}

}
