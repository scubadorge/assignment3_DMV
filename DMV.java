package assignment3_dmv;

import java.util.ArrayList;

public class DMV {
	//VARIABLES
	private String state;
	private ArrayList<Registration> dataBaseOfRegistrations;
	private ArrayList<Citation> dataBaseOfCitations;
	
	//CONSTRUCTORS
	public DMV() {}
	public DMV(String state, ArrayList<Registration> dataBaseOfRegistrations, ArrayList<Citation> dataBaseOfCitations) {
		this.state= state;
		this.dataBaseOfRegistrations= new ArrayList<>();
		this.dataBaseOfCitations= new ArrayList<>();
	}//DMV
	
	//METHODS
	public void registerVehicle(Vehicle vehicle, Owner owner) {
		Registration registration = new Registration(vehicle, owner);
        boolean found = false;
        for (Registration reg : dataBaseOfRegistrations) {
            if (reg.getVehicle().getLicense().equals(vehicle.getLicense())) {
                if (reg.isActive()) {
                    System.out.println("Error: Vehicle already has an active registration.");
                } else {
                    reg.setActive(true);
                    System.out.println("Updated registration for vehicle " + vehicle.getLicense());
                }//else
                found = true;
                break;
            }//if
        }//for
        if (!found) {
            dataBaseOfRegistrations.add(registration);
            System.out.println("Registered vehicle " + vehicle.getLicense());
        }
	}//registerVehicle
	
	public void registerCitation(Citation newCitation){
		
	}
	
	public String listRegistrations() {
		return "";
	}//registerCitation
	
	public String listCitations() {
		return "";
	}//registerCitation
	
	public void searchRegistrationByPlate(String plateInQuestion) {
		//search dataBaseOfRegistrations to see if any plates maatch the plateInQuestion.
	}//searchRegistrationByPlate
	
	public void searchRegistrationByID(String idInQuestion) {
		//search dataBaseOfRegistrations to see if any ID match the idInQuestion.
	}//searchRegistrationByID
	
	public void searchRegistrationByOwner(String plateInQuestion) {
		//search dataBaseOfRegistrations to see if any plates maatch the plateInQuestion.
	}//searchRegistrationByPlate
	
	public void searchCitationByRegistration(Registration registrationInQuestion) {
		//search the dataBaseOfRegistrations to find the citation that matches the registrationInQuestion
	}//searchCitationByRegistration
	
	public void searchCitationByOwner(Owner ownerInQuestion) {
		//search dataBaseOfCitations for a  matching Owner
	}//searchCitationByOwner
	
	public void searchCitationByID() {
		//search dataBaseOfCitations for a matching Citation ID
	}//searchCitationByID
	
	
	
	//SETTERS AND GETTERS
	
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
	
	//REGISTRATION STUFF
	
	/**
	 * @return the dataBaseOfRegistrations
	 */
	public ArrayList<Registration> getDataBaseOfRegistrations() {
		return dataBaseOfRegistrations;
	}
	/**
	 * @param dataBaseOfRegistrations the dataBaseOfRegistrations to set
	 */
	public void setDataBaseOfRegistrations(ArrayList<Registration> dataBaseOfRegistrations) {
		this.dataBaseOfRegistrations = dataBaseOfRegistrations;
	}
	
	
	//CITATION STUFF
	
	/**
	 * @return the dataBaseOfCitations
	 */
	public ArrayList<Citation> getDataBaseOfCitations() {
		return dataBaseOfCitations;
	}
	/**
	 * @param dataBaseOfCitations the dataBaseOfCitations to set
	 */
	public void setDataBaseOfCitations(ArrayList<Citation> dataBaseOfCitations) {
		this.dataBaseOfCitations = dataBaseOfCitations;
	}
	
	@Override
	public String toString() {
		return "DMV [" + (state != null ? "state=" + state + ", " : "")
				+ (dataBaseOfRegistrations != null ? "dataBaseOfRegistrations=" + dataBaseOfRegistrations + ", " : "")
				+ (dataBaseOfCitations != null ? "dataBaseOfCitations=" + dataBaseOfCitations : "") + "]";
	}//toString
	
	
	
	
	
	//public static void main(String[] args) {}//main

}//class
