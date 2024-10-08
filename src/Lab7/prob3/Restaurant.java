package Lab7.prob3;

public class Restaurant implements RestaurantInterface{
	private String restaurantName;
	private double baseDeliveryCharge;
	public double locationDistance;
	
	Restaurant(String name,double baseDeliveryCharge,double locationDistance){
		this.restaurantName = name;
		this.baseDeliveryCharge = baseDeliveryCharge;
		this.locationDistance = locationDistance;
	}
	
	public double calculateDeliveryCharge() {
		return baseDeliveryCharge + (locationDistance * 0.5); 
	}
	@Override
	public String getRestaurantName() {
		// TODO Auto-generated method stub
		return this.restaurantName;
	}


}
