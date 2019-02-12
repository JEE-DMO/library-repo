package fr.htc.library.model;

public class Member {
	
	private static int sequence = 100;

	String matricule;
	String firstName;
	String lastName;
	int age;

	public Member(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.matricule = generateMatricule();
	}

	/**
	 * 
	 * @return
	 */
	private String generateMatricule() {
		StringBuilder sb = new StringBuilder(firstName.substring(0, 1).toUpperCase());
		sb.append(lastName.substring(0, 1).toUpperCase());
		sb.append(sequence++);
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Member [matricule=" + matricule + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	

}