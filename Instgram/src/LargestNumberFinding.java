import java.util.Scanner;
public class LargestNumberFinding {
	public static void main(String ars[])
	{
		int x,y,z,large=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 Numbers");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		if (x > y && x > z)
		{
			large = x;
		}
		else
			if (y > x && y > z)
			{
				large = y;
			}
			else
				if (z > x && z > y)
				{
					large = z;
				}
		System.out.println("large number is " + large);
	}
}
