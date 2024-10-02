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
	
	
	
	public String getOrdernum() {
		return ordernum;
	}
	
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

}
