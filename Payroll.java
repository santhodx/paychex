package paychecks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Devdutt Santhosh
 *
 */
public class Payroll

{
	List<Employee> emplist = new ArrayList<Employee>();

	/**
	 * This adds employee details from object e.
	 * 
	 * @param e this is the object that holds the employee details
	 */
	public void addEmployee(Employee e)

	{
		emplist.add(e);
	}

	/**
	 * This returns the details of the employees in the order they were stored.
	 * 
	 * @return this returns employee details
	 */
	public List getEmployees()

	{
		return emplist;
	}

	/**
	 * This gives the total of all salaries including the bonuses paid for the
	 * employees listed under Payroll class.
	 * 
	 * @return the total salary paid by the company.
	 */
	public int getTotalSalaries()

	{
		int totalSalary = 0;

		for (int i = 0; i < emplist.size(); i++)

		{
			totalSalary += emplist.get(i).getSalary() + emplist.get(i).getBonus();
		}

		return totalSalary;
	}

}
