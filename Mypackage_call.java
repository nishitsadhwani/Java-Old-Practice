import Mypackage.Person;
import java.util.Scanner;
class Employee extends Person
{
	private float salary;
	
	
	Employee()
	{
		super();
		salary=0;
	}
	Employee(String nam, String addr,int ag, float sal)
	{
		super(nam,addr,ag);
		salary=sal;

	}	
	public void enterdata()
	{
		super.enterdata();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the salary : ");
		salary=s.nextFloat();
	}
	public void dispdata()
	{
		super.dispdata();
		System.out.println("Salary : " + salary);
	}
}
class Mypackage_call
{
	public static void main(String args[])
	{
			Employee e[] = new Employee[3] ;//Array of references
			for(int i = 0; i < 3; i++)
			{
				e[i] = new Employee() ;// Define the object(s)
				e[i].enterdata();
			}
			System.out.println();
			for(int i = 0; i < 3 ; i++)
			{
				e[i].dispdata();
			}
	}
}
			
				