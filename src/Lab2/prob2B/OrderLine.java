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
	
	
	public int getOrderLineNum() {
		return orderLineNum;
	}
	
	public void setOrderLineNum(int orderLineNum) {
		this.orderLineNum = orderLineNum;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
}

