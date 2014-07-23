import java.util.Scanner;
class monster
{
	public static void main(String args[])
	{

		Scanner s= new Scanner(System.in);

		String ans="y";

		String eye_color;
		String eye[][]={
					{"red","Green (Yellow+Blue)"},
					{"yellow","Purple (Red + Blue)"},
					{"blue","Orange( Yellow + Red )"},
					{"orange","Blue"},
					{"green","Red"},
					{"purple","Yellow"},
					{"black","No color"}
				};

		do
		{
		System.out.println("\n Enter the eye colour");
		eye_color=s.next();


		int i;


		for(i=0;i<7;i=i+1)
		{
			if (eye_color.equals(eye[i][0]))
			{
				System.out.println("The color required is : " + eye[i][1]);
			}

		}
		System.out.println("DO YOU WISH TO CONTINUE (y/n):");
		ans=s.next();
	}while(ans.equals("y")||ans.equals("Y"));
	}
}
