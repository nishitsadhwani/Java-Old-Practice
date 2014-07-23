class data
{
	float num1,num2;
	void getdata(float a, float b)
	{
		num1=a;
		num2=b;
	}
}
class Add extends data
{
	float sum;
	float calcadd( )
	{
		sum=num1+num2;
		return sum;
	}
}			
class Sub extends data
{
	float subs=0;
	float calcsub( )
	{
		subs=num1-num2;
		return subs;
	}
}	
class Mul extends data
{
	float prod=0;
	float calcprod( )
	{
		prod=num1*num2;
		return prod;
	}
}
class Div extends data
{
	float divi=0;
	float calcdiv( )
	{
		divi=num1/num2;
		return divi;
	}
}
class operations
{
	public static void main(String args[])
	{
		float a,s,m,d;
		//data obj= new data();
		
		
		Add ao =new Add();
		ao.getdata(10,2);
		a=ao.calcadd();		
		System.out.println("Addition	  =" + a);
		
		Sub so =new Sub();
		so.getdata(10,2);
		s=so.calcsub();		
		System.out.println("Substraction      =" + s);
		
		Mul mo =new Mul();
		mo.getdata(10,2);
		m=mo.calcprod();		
		System.out.println("Multiplication    =" + m);
		
		Div fo =new Div();
		fo.getdata(10,2);
		d=fo.calcdiv();		
		System.out.println("Division	  =" + d);

	}
}