package banking;

public class Person extends AccountHolder {
	private String firstName;
	private String lastName;
 
	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		super(idNumber);
		
	}

	public String getFirstName() {
		// complete the function
        return firstName;
	}

	public String getLastName() {
		// complete the function
        return lastName;
	}
}
