class Room
{
	float length,breadth;
	void getdata(float a,float b)
	{
		length=a;
		breadth=b;
	}
}
class Area
{
	public static void main(String args[])
	{
		float area;
		Room obj= new Room();
		obj.getdata(10,2);
		area= obj.length * obj.breadth;
		System.out.println("Area=" + area);
	}
}	