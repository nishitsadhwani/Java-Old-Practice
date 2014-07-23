import java.util.Scanner;
class node
{
	
	private int data;
	private node next;

	
	node()
	{
		data=0;
		next=null;
	}		
	void insert()
	{
	
		node obj=new node();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data :");
		obj.data= s.nextInt();	
		obj.next=null;
		node head;
		head=this;
		while( head.next !=null)
		{
			head=head.next;
		}
		head.next = obj ;		
	}
	void display()
	{
		node start = this.next;
		System.out.println("Your Linked List :");
		
		while(start.next != null )
		{
			
			System.out.print(" " +start.data );
			System.out.print("->");
			start=start.next;					
		}
		System.out.print(+start.data );
		
	}
	
	void reverse()
	{
		node  current = this.next ;
		node  prev = null;
		node  save = null;
	while(current != null)
	{
		save = current.next ;
		current.next = prev ;
		prev = current ;
		current = save ;
	}
	this.next = prev ;
	}
}
class Linked_list
{
	public static void main(String args[])
	{
		int num;
		int i=0;
		node obj1 = new node();
		Scanner s=new Scanner(System.in);		
		System.out.println("Enter the number of elements ");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			obj1.insert();
		}		
	obj1.display();
	obj1.reverse();
	obj1.display();
	}
}									