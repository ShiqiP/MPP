package Lab7.prob3;

import java.util.*;

import Lab3.prob3.Address;

public class FoodDeliverySystem {
	public static void main(String[] args) {
		// Create an ArrayList of Restaurants
		ArrayList<Restaurant> restaurants = new ArrayList<>();
		restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
		restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
		restaurants.add(new Restaurant("Burger World", 4.0, 7.5));
		// Create an ArrayList of Customers
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer("John Doe", 60));
		customers.add(new Customer("Jane Smith", 40));
		customers.add(new Customer("Bob Johnson", 80));
		// Print welcome message
		System.out.println("Welcome to the Food Delivery System!");
		/* Complete the part */
		
		double[] orderAmounts = new double[9];
		Random random = new Random();
		for(int i=0; i<9; i++) {
			orderAmounts[i] = random.nextDouble(50,100);
		}
		int i = 0;
		for(Restaurant r: restaurants) {
			for(Customer c: customers) {
				double delivery = r.calculateDeliveryCharge();
				double amount = orderAmounts[i] + delivery;
				double discount = r.calculateDiscount(amount);
				double total = amount - discount;
				System.out.println();
				RestaurantInterface.printFormattedData(r.getRestaurantName(), c.getCustomerName(),c.isLayaltyCustomer(c.getLoyaltyPoints()), amount, delivery, discount, total);
				i++;
			}
		}
		

	}
}
