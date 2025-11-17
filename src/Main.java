public class Main {
	public static void main(String[] args) {
		Company company = new Company("SortieSerfa", "12345");

		Address address1 = new Address("8 Rue des Frères Lumière", "68350", "Mulhouse");
		Establishment establishment1 = new Establishment(address1);

		Employee employee1 = new Employee("Dupont", "Jean", "Développeur");
		Employee employee2 = new Employee("Martin", "Marie", "Chef de projet");
		Employee employee3 = new Employee("Bernard", "Pierre", "Designer");

		establishment1.addEmployee(employee1);
		establishment1.addEmployee(employee2);

		company.addEstablishment(establishment1);

		for (Establishment establishment : company.getEstablishments()) {
			System.out.println(establishment);
			for (Employee employee : establishment.getEmployees()) {
				System.out.println("  - " + employee);
			}
		}
	}
}