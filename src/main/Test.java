package main;
import employee.AdministrationEmployee;
import employee.ContractType;
import employee.EnginneringEmployee;
import employee.ManagementEmployee;


// TODO: Auto-generated Javadoc
/**
 * The Class Test.
 */
public class Test {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// total salary
		double total = 0.0;

		// ManagementEmployee test
		ManagementEmployee me = new ManagementEmployee("Bill", 9);
		System.out.println(me.toString());
		System.out.println("My name is " + me.getName() + " and my salary is "
				+ me.getSalary() + " bitcoins");
		total += me.getSalary();

		// EnginneringEmployee test
		EnginneringEmployee ee = new EnginneringEmployee("Anna", 9,
				ContractType.INDEFINITE);
		System.out.println(ee.toString());
		System.out.println("My name is " + ee.getName() + " and my salary is "
				+ ee.getSalary() + " bitcoins");
		total += ee.getSalary();

		// EnginneringEmployee test
		EnginneringEmployee ee1 = new EnginneringEmployee("John", 5,
				ContractType.INDEFINITE);
		System.out.println(ee1.toString());
		System.out.println("My name is " + ee1.getName() + " and my salary is "
				+ ee1.getSalary() + " bitcoins");
		total += ee1.getSalary();

		// EnginneringEmployee test
		EnginneringEmployee ee2 = new EnginneringEmployee("Elizabeth", 3,
				ContractType.TRAINING);
		System.out.println(ee2.toString());
		System.out.println("My name is " + ee2.getName() + " and my salary is "
				+ ee2.getSalary() + " bitcoins");
		total += ee2.getSalary();

		// EnginneringEmployee test
		EnginneringEmployee ee3 = new EnginneringEmployee("Michael", 2,
				ContractType.TRAINING);
		System.out.println(ee3.toString());
		System.out.println("My name is " + ee3.getName() + " and my salary is "
				+ ee3.getSalary() + " bitcoins");
		total += ee3.getSalary();

		// AdministrationEmployee test
		AdministrationEmployee ae = new AdministrationEmployee("Albert");
		System.out.println(ae.toString());
		System.out.println("My name is " + ae.getName() + " and my salary is "
				+ ae.getSalary() + " bitcoins");
		total += ae.getSalary();

		// total salary calculation
		System.out.println("The total salary is " + total + " bitcoins.");
	}
}