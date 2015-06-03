package employee;

// TODO: Auto-generated Javadoc
/**
 * The Class ManagementEmployee.
 */
public class ManagementEmployee extends Employee {

	/**
	 * Instantiates a new management employee.
	 *
	 * @param name the name
	 * @param years the years
	 */
	public ManagementEmployee(String name, int years) {
		super(name, years, ContractType.INDEFINITE, "Management");
	}

	/* (non-Javadoc)
	 * @see week5.Employee#getSalary()
	 */
	@Override
	public double getSalary() {
		return 40000 + 6000 * this.getYears();
	}
}
