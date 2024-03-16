//Jorge Frias (jfrias5@toromail.csudh.edu)
/**
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 * **/
package assignment3_dmv;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	
	public Person(){}
	public Person(String fName, String lName, int age, String address) {
		this.firstName= fName;
		this.lastName= lName;
		this.age= age;
		this.address= address;
	}
	
	public Person(String fName, String lName, int age) {
		this.firstName= fName;
		this.lastName= lName;
	}
	
	public Person(String fName, String lName) {
		this.firstName= fName;
		this.lastName= lName;
	}
	
	public Person(String fName, String lName, String address ) {
		this.firstName= fName;
		this.lastName= lName;
		this.address= address;
		this.age=0;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [" + (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "") + "age=" + age + ", "
				+ (address != null ? "address=" + address + ", " : "") + "]";
	}//toString()
	
	public static void main(String[] args) {
		//Person human= new Person("Jorge", "Frias",29, "14614 Rodeo dr","La Licensia De Dios");
		//System.out.println(human);
	} //main

}//class
