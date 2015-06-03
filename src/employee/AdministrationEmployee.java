package employee;

// TODO: Auto-generated Javadoc
/**
 * The Class AdministrationEmployee.
 */
public class AdministrationEmployee extends Employee {

	/**
	 * Instantiates a new administration employee.
	 *
	 * @param name the name
	 */
	public AdministrationEmployee(String name) {
		super(name, 0, ContractType.TEMPORARY, "Administration");
	}

	/* (non-Javadoc)
	 * @see week5.Employee#getSalary()
	 */
	@Override
	public double getSalary() {
		return 18000;
	}
}
