package Lab2.Problem3;

import java.sql.Date;

public class DriverLicense {
	private int licenseNumber;
	private Date expirationDate;
	
	private DriverLicense(People people) {
		people.setDriverLicense(this);
	}
	
	public static DriverLicense newDriverLicense(People people) {
		if(people == null)
			throw new NullPointerException("Null people");
		return new DriverLicense(people);
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public void setExpirationDate(Date date) {
		this.expirationDate = date;
	}
	public int getLicenseNumber() {
		return this.licenseNumber;
	}
}
