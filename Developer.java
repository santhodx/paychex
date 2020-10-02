package paychecks;

/**
 * This class is inherited from the Employee class and can execute all the
 * functions in Employee class.
 * 
 * @author Devdutt Santhosh
 *
 */
public class Developer extends Employee

{
	/**
	 * This constructs an employee with a name and a salary.
	 * 
	 * @param name   the name of the employee
	 * @param salary the salary of the employee
	 */
	public Developer(String name, int salary)

	{
		super(name, salary);
	}

	/**
	 * This returns a String containing the employee's title.
	 * 
	 * @return This returns title "Developer"
	 */
	public String getTitle()

	{
		return "Developer";
	}

	/**
	 * This returns an integer representing the employee's bonus.
	 * 
	 * @return This returns bonus amount of 5000
	 */
	public int getBonus()

	{
		return 5000;
	}

}
