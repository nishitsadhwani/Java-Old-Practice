import java.util.Scanner;
class node
{
	
	private int data;
	private node next;

	
	node()
	{
		data=0;
			
	}		
	void insert()
	{
		//int d=0;
		node obj=new node();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data :");
		obj.data= s.nextInt();	
		obj.next=null;
		
	}
}
class Linked_list
{
	public static void main(Strings args[])
	{
		
				