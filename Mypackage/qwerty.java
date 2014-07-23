package Mypackage;

import java.util.Scanner;

class Person
{
	private String name;
	private String address;
	private int age;
	public Person()
	{
		name=" ";
		address=" ";
		age=0;
	}
	public Person(String nam, String addr,int ag)
	{
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
		System.out.println("Address :"+ address );
		System.out.println("Age : " + age);
	}
}
	public class qwerty
	{
	    public static void main(String args[])
        {
                Person obj= new Person();
                obj.enterdata();
                obj.dispdata();

        }
	}

