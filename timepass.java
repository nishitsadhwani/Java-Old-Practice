import java.util.Scanner;
class Publication
{
	String title;
	float price;
	Publication()
	{
		title= new String();
		this.title="";
		price=0;
	}
	Publication(String titl, float pric)
	{
		title= new String();
		this.title=titl;
		price=pric;
	}	
	void getdata()
	{
		Scanner s=new Scanner( System.in);
		System.out.println("Enter the title :");
		title=s.next();
		System.out.println("Enter the price :");
		price=s.nextFloat();
	}
	
	void putdata()
	{
		System.out.println("Title : " + title );
		System.out.println("Price : " + price );
	}
}		


class Book extends Publication
{
	int page_count;
	Book()
	{
		page_count=0;
	}
	Book(int cnt)
	{
		page_count=cnt;
	}
	void getdata()
	{
		super.getdata();
		Scanner s=new Scanner( System.in);
		System.out.println("Enter the page count :");
		page_count=s.nextInt();
	}
	
	void putdata()
	{
		super.putdata();
		System.out.println("Page_count :"+page_count);
	}
}


class Tape extends Publication
{
	float play_time;
	Tape()
	{
		play_time=0;
	}
	Tape(float tim)
	{
		play_time=tim;
	}
	void getdata()
	{
		super.getdata();
		Scanner s=new Scanner( System.in);
		System.out.println("Enter the time :");
		play_time=s.nextFloat();
	}
	
	void putdata()
	{
		super.putdata();	
		System.out.println("Time : " +play_time );

	}
}

class timepass
{
	public static void main(String args[])
	{
		Book obj= new Book();
		obj.getdata();
		obj.putdata();
		System.out.println();
		Tape obj2= new Tape();
		obj2.getdata();
		obj2.putdata();
	}
}	