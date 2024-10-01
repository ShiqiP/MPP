package Lab2.Problem3;

import java.util.Date;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		People people = new People("Shiqi Pang");
		DriverLicense driverLicense = DriverLicense.newDriverLicense(people);
		driverLicense.setLicenseNumber(new Random().nextInt());
		System.out.println(driverLicense.getLicenseNumber());
	}
}
