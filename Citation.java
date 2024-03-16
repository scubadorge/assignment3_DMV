//Jorge Frias(jfrias5@toromail.csudh.edu)
/**
 * 
 */

package assignment3_dmv;

import java.util.Date;

public class Citation {
	private Owner multado;
	private Date date;
	private int offenceCode;
	private double amount;
	private String status;
	private Registration registration;
	
	private Citation() {}
	Citation(Owner multado, Date date, int offenceCode, double amount, String status, Registration registration) {
		this.multado= multado;
		this.date= date;
		this.offenceCode= offenceCode;
		this.amount= amount;
		this.status= status;
		this.registration= registration;
	}//Citation
	
	//GETTERS AND SETTERS
	/**
	 * @return the multado
	 */
	public Owner getMultado() {
		return multado;
	}
	/**
	 * @param multado the multado to set
	 */
	public void setMultado(Owner multado) {
		this.multado = multado;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the offenceCode
	 */
	public int getOffenceCode() {
		return offenceCode;
	}
	/**
	 * @param offenceCode the offenceCode to set
	 */
	public void setOffenceCode(int offenceCode) {
		this.offenceCode = offenceCode;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the registration
	 */
	public Registration getRegistration() {
		return registration;
	}
	/**
	 * @param registration the registration to set
	 */
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
	@Override
	public String toString() {
		return "Citation [" + (multado != null ? "multado=" + multado + ", " : "")
				+ (date != null ? "date=" + date + ", " : "") + "offenceCode=" + offenceCode + ", amount=" + amount
				+ ", " + (status != null ? "status=" + status + ", " : "")
				+ (registration != null ? "registration=" + registration : "") + "]";
	}
	
	
	
	
	public static void main(String[] args) {}//main

}//class
