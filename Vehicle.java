//Jorge Frias (jfrias5@toromail.csudh.edu)
/**
 * RULES: 
 *	2 - A vehicle can have multiple registrations but only one 
 *		registration will be active at any given time 
 *		i.e. if you find a valid registration where the registration had 
 *		not expired then throw an error and do not create a new registration.
 *
 *	3 - A vehicle can have multiple citations.
 *
 *	4 - A vehicle must not be allowed a new registration if one or more 
 *		citations are still pending payment.
 */

package assignment3_dmv;

public class Vehicle {
	//VARIABLES
	private String vim;
	private String make;
	private String model;
	private String color;
	private String typeOfVehicle;
	private int numberOfDoors;
	
	//CONSTRUCTORS
	private Vehicle() {}
	Vehicle(String vim, String make, String model, String color, String type, int doors) {
		this.vim= vim;
		this.make= make;
		this.model= model;
		this.color= color;
		this.typeOfVehicle= type;
		this.numberOfDoors= doors;
	}//Vehicle
	
	//METHODS
	//	GETTERS AND SETTERS
	/**
	 * @return the vim
	 */
	public String getVim() {
		return vim;
	}
	/**
	 * @param vim the vim to set
	 */
	public void setVim(String vim) {
		this.vim = vim;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the typeOfVehicle
	 */
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	/**
	 * @param typeOfVehicle the typeOfVehicle to set
	 */
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	//METHODS
	@Override
	public String toString() {
		return "Vehicle [" + (vim != null ? "vim=" + vim + ", " : "") 
							+ (make != null ? "make=" + make + ", " : "")
								+ (model != null ? "model=" + model + ", " : "") 
									+ (color != null ? "color=" + color + ", " : "")
										+ (typeOfVehicle != null ? "typeOfVehicle=" + typeOfVehicle + ", " : "") 
											+ "numberOfDoors="+ numberOfDoors 
											+ "]";
	}
	
	/**
	public static void main(String[] args) {
		Vehicle mamalona= new Vehicle("123456789","Ford","Focus","Red","Truck",2);
		System.out.println(mamalona);
	}//main
	**/
	
}//class
