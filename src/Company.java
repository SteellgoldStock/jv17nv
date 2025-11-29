import java.util.ArrayList;
import java.util.List;

public class Company {
	private String companyName;
	private String siretNumber;
	private List<Establishment> establishments;

	public Company(String companyName, String siretNumber) {
		this.companyName = companyName;
		this.siretNumber = siretNumber;
		this.establishments = new ArrayList<>();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSiretNumber() {
		return siretNumber;
	}

	public void setSiretNumber(String siretNumber) {
		this.siretNumber = siretNumber;
	}

	public List<Establishment> getEstablishments() {
		return establishments;
	}

	public void addEstablishment(Establishment establishment) {
		this.establishments.add(establishment);
	}

	public void removeEstablishment(Establishment establishment) {
		this.establishments.remove(establishment);
	}

	public int getEstablishmentCount() {
		return establishments.size();
	}

	public int getTotalEmployees() {
		int total = 0;

		for (Establishment establishment : establishments) total += establishment.getEmployeeCount();
		return total;
	}

	@Override
	public String toString() {
		return companyName + " (SIRET: " + siretNumber + ") - "
			   + establishments.size() + " établissement(s), "
			   + getTotalEmployees() + " salarié(s)";
	}
}

