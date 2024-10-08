package Lab7.prob3;

public interface CustomerInterface {
	default boolean isLayaltyCustomer(int loyaltypoints) {
		return loyaltypoints > 50;
	}
	String getCustomerName();
	int getLoyaltyPoints();
}
