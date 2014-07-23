class rectangle
{
	double length,breadth;
	
	rectangle()
	{
		length=0.0;
		breadth=0.0;
	}
	
	rectangle( double l, double b)
	{
		length=l;
		breadth=b;
	}
	
	void disp_area()	
	{
		System.out.println(" Area of rectangle is : " + (length*breadth));
	}
}
class cuboid extends rectangle
{
	double height;
	
	cuboid()
	{
		super();
		height=0.0;
	}

	cuboid(double l, double b, double h)
	{
		super(l,b);
		height=h;
	}

	void disp_vol()
	{
		System.out.println(" The volume of cuboid is : " + (length*breadth*height));
	}
}
class singleinhe
{
	public static void main( String args[])
	{
		cuboid obj = new cuboid(10.0, 20.0, 5.0);
		obj.disp_area();
		obj.disp_vol();
	}
}	