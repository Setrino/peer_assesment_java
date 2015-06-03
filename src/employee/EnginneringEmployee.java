package employee;

// TODO: Auto-generated Javadoc
/**
 * The Class EnginneringEmployee.
 */
public class EnginneringEmployee extends Employee {

	/**
	 * Instantiates a new enginnering employee.
	 *
	 * @param name the name
	 * @param years the years
	 * @param type the type
	 */
	public EnginneringEmployee(String name, int years, ContractType type) {
		super(name, years, type, "Engineering");
	}

	/* (non-Javadoc)
	 * @Override
	 */
	@Override
	public double getSalary() {
		return 25000 + 25000 * 0.1 * getYears();
	}
}
