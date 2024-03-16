//Jorge Frias(jfrias5@toromail.csudh.edu)
/**
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 *
 * RULES: 
 *	2 - A vehicle can have multiple registrations but only one 
 *		registration will be active at any given time 
 *		i.e. if you find a valid registration where the registration had 
 *		not expired then throw an error and do not create a new registration.
 *
 *	4 - A vehicle must not be allowed a new registration if one or more 
 *		citations are still pending payment.
 */

package assignment3_dmv;

import java.util.ArrayList;
import java.util.Date;

public class Registration {
	private int uniqueID;
	private Date startDate;
	private Date endDate;
	private ArrayList<Owner> owners;
	private Vehicle vehicle;
	private String plate;
	//-
	private Boolean anyPendingPayments = false;
	private Boolean isRegistrationActive= false;
	
	public Registration() {}
	public Registration(int uniqueID, Date startDate, Date endDate, ArrayList<Owner> owners, Vehicle vehicle, String plate) {
		this.uniqueID= uniqueID; //need to create a randomizer so it can create a random set of numbers. I'll keep it to 9 digits
		this.startDate= startDate;
		this.endDate= endDate;
		this.owners= owners;
		this.plate= plate;
	}//Registration
	
	//METHODS

	
	//GETTERS AND SETTERS
	
	/**
	 * @return the uniqueID
	 */
	public int getUniqueID() {
		return uniqueID;
	}
	
	/**
	 * @param uniqueID the uniqueID to set
	 */
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the owners
	 */
	public ArrayList<Owner> getOwners() {
		return owners;
	}
	/**
	 * @param owners the owners to set
	 */
	public void setOwners(ArrayList<Owner> owners) {
		this.owners = owners;
	}
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}
	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	
	
	public static void main(String[] args) {}//main

}//class
