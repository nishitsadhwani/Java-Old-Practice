import java.util.Scanner;
import java.lang.Exception;
class NoMatchException extends Exception
{
	NoMatchException(String message)
	{
		super(message);
	}
}
class NumericNameException extends Exception
{
	NumericNameException(String mess)
	{
		super(mess);
	}
}

class Employee
{
	private String Name;
	private int age;
	private float salary;
	public void enterdata()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name :");
		try
		{
			Name= s.next();
			if(Name != "India")
			{
				throw new NoMatchException("Name is Not India");
			}
		}
		/*catch(NumericNameException a)
		{
			System.out.println("\n Caught the Exception1 ");
			System.out.println(a.getMessage());
		}*/
		catch(NoMatchException e)
		{
			System.out.println("\n ************************** ");
			System.out.println("\n Caught the Exception2 ");
			System.out.println(e.getMessage());
			System.out.println("\n ************************** ");

		}
		System.out.println("Enter the age :");
		age=s.nextInt();
		System.out.println("Enter the salary :");
		salary=s.nextFloat();
	}
	public void dispdata()
	{
		System.out.println("Name :"+ Name);
		System.out.println("Age :"+ age);
		System.out.println("Salary :"+ salary);
	}
}



class exphand
{
	public static void main(String args[])
	{
		Employee obj= new Employee();
		obj.enterdata();

		obj.dispdata();
	}
}
