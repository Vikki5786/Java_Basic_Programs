import java.util.Scanner;
class  Grade
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade");
		char g = scan.next().charAt(0);
		if (g == 'A' || g == 'a')
		{
			System.out.println("First Rank");
		}
		else if (g == 'B' || g == 'b')
		{
			System.out.println("Second Rank");
		}
		else if (g == 'C' || g == 'c')
		{
			System.out.println("First Class");
		}
		else if (g == 'D' || g == 'd')
		{
			System.out.println("Second Class");
		}
		else if (g == 'E' || g == 'e')
		{
			System.out.println("Just Pass");
		}
		else if (g == 'F' || g == 'f')
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Enter Valid");
		}
	}
}
