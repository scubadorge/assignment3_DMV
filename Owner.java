/*Jorge Frias (jfrias5 @toromail.csudh.edu)
 */
/*	@author Jorge Frias (jfrias 5 @toromail.csudh.edu)
 * */
package assignment3_dmv;

public class Owner extends Person{
	//VARIABLES
	private String driverLicense;
	private String city;
	private String state;
	private String zip;
	
	
	//CONSTRUCTORS
	public Owner() {}
	public Owner(String fName, String lName, int age, String address, String city, String state, String zip, String driverLicense) {
		super(fName,lName,age,address);
		this.city= city;
		this.state= state;
		this.zip= zip;
		this.driverLicense= driverLicense;
	}//Owner
	public Owner(String fName, String lName, String address, String city, String state, String zip) {
		super(fName,lName,address);
		this.city= city;
		this.state= state;
		this.zip= zip;
	}//Owner
	public Owner(String fName, String lName) {
		super(fName, lName);
		
	}
	
	//METHODS
	/**
	 * @return the driverLicense
	 */
	public String getDriverLicense() {
		return driverLicense;
	}
	/**
	 * @param driverLicense the driverLicense to set
	 */
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	@Override
	public String toString() {
		return "Owner [" + super.toString() + (driverLicense != null ? "driverLicense=" + driverLicense + ", " : "")
				+ (city != null ? "city=" + city + ", " : "") + (state != null ? "state=" + state + ", " : "")
				+ (zip != null ? "zip=" + zip : "") + "]";
	}
	/**
	public static void main(String[] args) {
		Owner Me= new Owner("Jorge","Frias");
		System.out.println(Me);
	}//main
	**/
}//class
