package employee;

// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */
public class Employee implements Employed {

	/** The name. */
	private String name;
	
	/** The contract. */
	private int contract;
	
	/** The type. */
	private ContractType type;
	
	/** The years. */
	private int years;
	
	/** The department. */
	private String department;

	/**
	 * Instantiates a new employee.
	 *
	 * @param name the name
	 * @param years the years
	 * @param type the type
	 * @param department the department
	 */
	public Employee(String name, int years, ContractType type, String department) {
		this.name = name;
		this.years = years;
		this.contract = type.ordinal();
		this.type = type;
		this.department = department;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "- " + name + ": " + department + " department, "
				+ type.name().toLowerCase() + " contract, " + years
				+ " years in company, salary of " + getSalary() + " bitcoins";
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name String cannot be null");
		}
		this.name = name;
	}

	/**
	 * Gets the contract.
	 *
	 * @return the contract
	 */
	public int getContract() {
		return contract;
	}

	/**
	 * Sets the contract.
	 *
	 * @param contract the new contract
	 */
	public void setContract(int contract) {
		if (contract < 0 || contract > 2) {
			throw new IllegalArgumentException("Integer is out of bounds " + Integer.toString(contract));
		}
		this.contract = contract;
	}

	/**
	 * Gets the years.
	 *
	 * @return the years
	 */
	public int getYears() {
		return years;
	}

	/**
	 * Sets the years.
	 *
	 * @param years the new years
	 */
	public void setYears(int years) {
		if (years < 0) {
			throw new IllegalArgumentException("Year cannot be negative " + Integer.toString(years));
		}
		this.years = years;
	}

	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(String department) {
		if (department == null) {
			throw new IllegalArgumentException("Department String cannot be null");
		}
		this.department = department;
	}

	/* (non-Javadoc)
	 * @see week5.Employed#getSalary()
	 */
	@Override
	public double getSalary() {
		return 0;
	}

	/**
	 * Gets the contract type.
	 *
	 * @return the contract type
	 */
	public ContractType getContractType() {
		return type;
	}

	/**
	 * Sets the contract type.
	 *
	 * @param type the new contract type
	 */
	public void setContractType(ContractType type) {
		if (type.ordinal() > 2) {
			throw new IllegalArgumentException("Contract type doesn't exist");
		}
		this.type = type;
		setContract(type.ordinal());
	}
}
