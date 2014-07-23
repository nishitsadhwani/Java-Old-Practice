class class1
{
	int x;
	
	class1()
	{
		System.out.println(" Default constructor(Class 1)is invoked " );
		x=0;
	}
	
	class1(int a)
	{
		System.out.println(" Parameterized constructor(Class 1)is invoked " );
		x=a;
	}
	
	void disp_x()
	{
		System.out.println(" x= " + x );
	}
}

class class2 extends class1
{
	int y;
	
	class2()
	{
		super();
		System.out.println(" Default constructor(Class 2)is invoked " );
		y=0;
	}
	
	class2(int X, int a)
	{
		super(X);
		System.out.println(" Parameterized constructor(Class 2)is invoked " );
		y=a;
	}
	
	void disp_y()
	{
		System.out.println(" y= " + y );
	}
}

class class3 extends class2
{
	int z;
	
	class3()
	{
		super();
		System.out.println(" Default constructor(Class 3)is invoked " );
		z=0;
	}
	
	class3(int X, int Y, int a)
	{
		super(X,Y);
		System.out.println(" Parameterized constructor(Class 3)is invoked " );
		z=a;
	}
	
	void disp_z()
	{
		System.out.println(" z= " + z );
	}
}

class multilevel
{
	public static void main( String args[])	
	{
		class3 obj= new class3();
		obj.disp_x();
		obj.disp_y();
		obj.disp_z();

		class3 obj2= new class3(4,5,6);
		obj2.disp_x();
		obj2.disp_y();
		obj2.disp_z();
	}
}	