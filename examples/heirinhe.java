class student
{
	String F_name=new String();
	String L_name=new String();
	int age,rollno;
	
	student(String F_name,String L_name, int age, int rollno )
	{
		this.F_name= F_name;
		this.L_name= L_name;
		this.age= age;
		this.rollno=rollno;
	}
	
	void disp_data()
	{
		System.out.println("\n\t First Name : " + F_name);
		System.out.println("\n\t Last Name : " + L_name);
		System.out.println("\n\t Age : " + age);
		System.out.println("\n\t Roll No : " + rollno);
	}
}

class arts extends student
{
	String asub1= new String();
	String asub2= new String();
	String asub3= new String();
	
	arts(String F_name,String L_name, int age, int rollno, asub1, asub2, asub3)
	{	
		super(String F_name,String L_name, int age, int rollno );
		this.asub1= asub1;
		this.asub2= asub2;
		this.asub3= asub3;
	}

	void disp_data()
	{
		System.out.println("\n\t First Name : " + F_name);
		System.out.println("\n\t Last Name : " + L_name);
		System.out.println("\n\t Age : " + age);
		System.out.println("\n\t Roll No : " + rollno);
		System.out.println("\n\t Sub1 : " + asub1);
		System.out.println("\n\t Sub2 : " + asub2);
		System.out.println("\n\t Sub3 : " + asub3);
	}
}

class science extends student
{
	String ssub1= new String();
	String ssub2= new String();
	String ssub3= new String();
	
	arts(String F_name,String L_name, int age, int rollno, asub1, asub2, asub3)
	{	
		super(String F_name,String L_name, int age, int rollno );
		this.ssub1= ssub1;
		this.ssub2= ssub2;
		this.ssub3= ssub3;
	}

	void disp_data()
	{
		System.out.println("\n\t First Name : " + F_name);
		System.out.println("\n\t Last Name : " + L_name);
		System.out.println("\n\t Age : " + age);
		System.out.println("\n\t Roll No : " + rollno);
		System.out.println("\n\t Sub1 : " + ssub1);
		System.out.println("\n\t Sub2 : " + ssub2);
		System.out.println("\n\t Sub3 : " + ssub3);
	}
}

class commerce extends student
{
	String csub1= new String();
	String csub2= new String();
	String csub3= new String();
	
	arts(String F_name,String L_name, int age, int rollno, asub1, asub2, asub3)
	{	
		super(String F_name,String L_name, int age, int rollno );
		this.csub1= csub1;
		this.csub2= csub2;
		this.csub3= csub3;
	}

	void disp_data()
	{
		System.out.println("\n\t First Name : " + F_name);
		System.out.println("\n\t Last Name : " + L_name);
		System.out.println("\n\t Age : " + age);
		System.out.println("\n\t Roll No : " + rollno);
		System.out.println("\n\t Sub1 : " + csub1);
		System.out.println("\n\t Sub2 : " + csub2);
		System.out.println("\n\t Sub3 : " + csub3);
	}
}

class heirinhe
{
	public static void main( String args[] )
	{
		arts a = new Arts("Nishit", "Sadhwani", 26, 1200, "English","Economics",  "Hindi") ;
		System.out.println("\n Displaying the details of the arts student") ;
		a.Display_data( );
	Science s = new Science("Chander", "Mohan", 27, 2090, 
 				"Physics", "Chemistry", "Maths") ;
    	System.out.println("\n Displaying the details of the science student") ;
	s.Display_data( );
	Commerce c = new Commerce("Karan", "Vasudeva", 23, 4001, 
		  "Accounts", "Econimics", "Maths") ;
    	System.out.println("\n Displaying the details of the commerce student");
	c.Display_data( );
	}
}
