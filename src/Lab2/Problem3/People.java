package Lab2.Problem3;

public class People {
	private String name;
	private DriverLicense driverLicense;
	
	public People(String name) {
		this.name = name;
	}
	public void setDriverLicense(DriverLicense driverLicense) {
		this.driverLicense = driverLicense;
	}
	public DriverLicense getDriverLicense() {
		return this.driverLicense;
	}
}
