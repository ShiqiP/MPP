package Lab7.prob3;

public interface RestaurantInterface {
	String getRestaurantName();
	double calculateDeliveryCharge();
	
	static void printFormattedData(String restaurantName, String customerName,boolean loyaty, double orderAmount, double deliveryCharge,double discount,double totalAfterDiscount) {
		String customerStatus = loyaty?"Loyal Customer":"New Customer";
		System.out.println("Processing order for Customer:" + customerName + " at " + restaurantName);
		System.out.println("Customer Loyalty Status: " +  customerStatus);
		System.out.println("Restaurant: " + restaurantName);
		System.out.println("Customer: " + customerName);
		System.out.printf("Order Amount: $%.2f\n",orderAmount);
		System.out.printf("Delivery Charge: $%.2f\n",deliveryCharge);
		System.out.printf("Discount Applied: $%.2f\n",discount);
		System.out.printf("Total after Discount: $%.2f\n",totalAfterDiscount);
	}
	default double calculateDiscount(double totalOrderAmount) {
		if(totalOrderAmount > 100)
			return totalOrderAmount*0.05;
		else 
			return 0;
	}
}
