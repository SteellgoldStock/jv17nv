import java.time.LocalDate;

public class Employee {
	private String lastName;
	private String firstName;
	private String role;
	private String socialSecurityNumber;
	private double monthlyHours;
	private double hourlyRate;

	public Employee(
		 String lastName,
		 String firstName,
		 String role,
		 LocalDate dateOfBirth,
		 double monthlyHours,
		 double hourlyRate
	) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.role = role;

		this.monthlyHours = monthlyHours;
		this.hourlyRate = hourlyRate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return monthlyHours * hourlyRate;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + role + ")";
	}
}