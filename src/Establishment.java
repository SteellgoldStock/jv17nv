import java.util.ArrayList;
import java.util.List;

public class Establishment {
	private Address address;
	private List<Employee> employees;

	public Establishment(Address address) {
		this.address = address;
		this.employees = new ArrayList<>();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}

	public int getEmployeeCount() {
		return employees.size();
	}

	@Override
	public String toString() {
		return "Établissement à " + address + " (" + employees.size() + " salarié(s))";
	}
}

