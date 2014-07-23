import java.util.Scanner;
package Mypackage;
public class Person
{
	private String name;
	private String address;
	private int age;
	Person()
	{
		name= new String();
		address= new String();
		this.name="";
		this.address="";
		age=0;
	}
	Person(String nam, String addr,int ag)
	{
		name= new String();
		address= new String();
		this.name=nam;
		this.address=addr;
		age=ag;

	}	
	public void enterdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name : ");
		name=s.next();
		System.out.println("Enter the address : ");
		address=s.next();
		System.out.println("Enter the age : ");
		age=s.nextInt();	
	}
	public void dispdata()
	{
		System.out.println();
		System.out.println("Name : " + name);
		System.out.println("Address :+ address ");
		System.out.println("Age : " + age);
	}
}