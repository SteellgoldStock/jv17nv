import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Company company = new Company("SortieSerfa", "12345");

		Address address1 = new Address("8 Rue des Frères Lumière", "68350", "Mulhouse");

		Establishment establishment1 = new Establishment(address1);
		Employee employee1 = new Employee("Dupont", "Jean", "Développeur", LocalDate.of(2003, 12, 12), 167.33, 11.88);
		Employee employee2 = new Employee("Martin", "Marie", "Chef de projet", LocalDate.of(1993, 3, 6), 198, 84);
		Employee employee3 = new Employee("Bernard", "Pierre", "Designer", LocalDate.of(1988, 9, 7), 151, 118);

		establishment1.addEmployee(employee1);
		establishment1.addEmployee(employee2);
		establishment1.addEmployee(employee3);

		company.addEstablishment(establishment1);

		for (Establishment establishment : company.getEstablishments()) {
			System.out.println(establishment);
			for (Employee employee : establishment.getEmployees()) {
				System.out.println("  - " + employee + " - Salaire: " + employee.getSalary() + "€");
			}
			
		}
	}
}