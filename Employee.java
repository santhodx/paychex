package paychecks;

/**
 * This is an abstract class which is extended to the Developer class and the
 * Manager class used to store the employee name, salary, title and bonus.
 * 
 * @author Devdutt Santhosh
 */
abstract class Employee

{
	String name;
	int salary;

	/**
	 * This constructs an employee with a specified name and salary.
	 * 
	 * @param name   name the name of the employee
	 * @param salary the salary of the employee
	 */
	public Employee(String name, int salary)

	{
		this.name = name;
		this.salary = salary;
	}

	/**
	 * This returns the employee's name as supplied to the constructor.
	 * 
	 * @return this employee's name
	 */
	public String getName()

	{
		return name;
	}

	/**
	 * This returns the employee's salary as supplied to the constructor.
	 * 
	 * @return this employee's salary
	 */
	public int getSalary()

	{
		return salary;
	}

	/**
	 * This is an abstract method that returns a String containing the employee's
	 * title.
	 * 
	 * @return the title of the employee
	 */
	public abstract String getTitle();

	/**
	 * This is an abstract method that returns an integer representing the
	 * employee's bonus.
	 * 
	 * @return the bonus amount
	 */
	public abstract int getBonus();

}
