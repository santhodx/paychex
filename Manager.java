package paychecks;

/**
 * This class is inherited from the Employee class and can execute all the
 * functions in Employee class.
 * 
 * @author Devdutt Santhosh
 *
 */
public class Manager extends Employee

{
	/**
	 * This constructs an employee with a specified name and salary.
	 * 
	 * @param name   is the name of employee
	 * @param salary is the salary of employee
	 */
	public Manager(String name, int salary)

	{
		super(name, salary);
	}

	/**
	 * This returns a String containing the employee's title.
	 * 
	 * @return This returns title "Manager".
	 */
	public String getTitle()

	{
		return "Manager";
	}

	/**
	 * This returns an integer representing the employee's bonus.
	 * 
	 * @return This gives amount 10000
	 */
	public int getBonus()

	{
		return 10000;
	}

}
