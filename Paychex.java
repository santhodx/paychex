package paychecks;

/**
 * This class implements payroll computations on your screen.
 * 
 * @author Devdutt Santhosh
 *
 */
public class Paychex

{
	/**
	 * supplies command-line arguments as an array of String objects.
	 * 
	 * @param args an array of command-line arguments for the application.
	 */
	public static void main(String[] args)

	{
		Payroll obj = new Payroll();
		PayrollPrinter pp = new PayrollPrinter();

		if (args.length % 3 != 0)

		{
			System.err.print("The number of arguments must be divisible by three.\n");
			System.exit(1);
		}

		for (int i = 1; i < args.length; i += 3)

		{
			int sal = 0;

			try

			{
				sal = Integer.parseInt(args[i + 1]);
			} catch (NumberFormatException e)

			{
				System.err.print("The string " + "'" + args[i + 1] + "'");
				System.err.print(" is not a legal integer.\n");
				System.exit(1);
			}

			if (args[i].equals("D"))

			{
				Developer dev = new Developer(args[i - 1], sal);
				obj.addEmployee(dev);
			} else if (args[i].equals("M"))

			{
				Manager man = new Manager(args[i - 1], sal);
				obj.addEmployee(man);
			} else

			{
				System.err.print("Employee type must be one of D or M. You gave " + args[i]);
				System.err.print(".\n");
				System.exit(1);
			}

		}
		pp.printSalaryReport(obj);
	}

}
