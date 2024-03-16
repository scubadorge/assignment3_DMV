//Jorge Frias(jfrias5@toromail.csudh.edu)
package assignment3_dmv;

import java.util.ArrayList;
import java.util.Date;

public class MyDMVexperience {

    public static void main(String[] args) {
        // Create instances of classes
        Person person = new Person("John", "Doe", 30, "123 Main St");
        Owner owner = new Owner("Jane", "Doe", 25, "456 Main St", "New York", "NY", "10001", "123456789");
        Vehicle vehicle = new Vehicle("ABC123", "Toyota", "Camry", "Blue", "Sedan", 4);
        Registration registration = new Registration(1, new Date(), new Date(), new ArrayList<>(), vehicle, "ABC123");
        Citation citation = new Citation(owner, new Date(), 123, 100.0, "Unpaid", registration);

        // Create DMV instance
        DMV dmv = new DMV("NY", new ArrayList<>(), new ArrayList<>());

        // Add registration to DMV
        dmv.registerVehicle(new ArrayList<>(), vehicle);

        // Add citation to DMV
        dmv.registerCitation(citation);

        // Print DMV information
        System.out.println(dmv);

        // Search for registration by plate
        dmv.searchRegistrationByPlate("ABC123");

        // Search for citation by registration
        dmv.searchCitationByRegistration(registration);

        // Search for citation by owner
        dmv.searchCitationByOwner(owner);
    }
}
