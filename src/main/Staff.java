package main;
import java.util.ArrayList;
import java.util.List;

import employee.AdministrationEmployee;
import employee.ContractType;
import employee.Employee;
import employee.EnginneringEmployee;
import employee.ManagementEmployee;

/**
 * The Class Staff.
 */
public class Staff {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Employee> staff = new ArrayList<Employee>();
		double manSalary = 0;
		double engSalary = 0;
		double admSalary = 0;

		staff.add(new ManagementEmployee("Bill", 9));
		staff.add(new EnginneringEmployee("Anna", 9, ContractType.INDEFINITE));
		staff.add(new EnginneringEmployee("John", 5, ContractType.INDEFINITE));
		staff.add(new EnginneringEmployee("Elizabeth", 3, ContractType.TRAINING));
		staff.add(new EnginneringEmployee("Michael", 2, ContractType.TRAINING));
		staff.add(new AdministrationEmployee("Albert"));

		for (Employee staffM : staff) {
			System.out.println(staffM.toString());
			String department = staffM.getDepartment();
			if (department == "Management") {
				manSalary += staffM.getSalary();
			} else if (department == "Engineering") {
				engSalary += staffM.getSalary();
			} else if (department == "Administration") {
				admSalary += staffM.getSalary();
			}
		}

		System.out.println("\nMANAGEMENT TOTAL SALARY: " + manSalary);
		System.out.println("ENGINEERING TOTAL SALARY: " + engSalary);
		System.out.println("ADMINISTRATION TOTAL SALARY: " + admSalary);
		System.out.println("ACME TOTAL SALARY: "
				+ (manSalary + engSalary + admSalary));
	}
}
