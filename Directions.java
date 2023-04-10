import java.util.Scanner;
class  Directions
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Direction Number ");
		int DirectionNumber = scan.nextInt();
		if (DirectionNumber == 1)
		{
			System.out.println("Selected direction is : East");
		}
		else if (DirectionNumber == 2)
		{
			System.out.println("Selected direction is : West");
		}
		else if (DirectionNumber == 3)
		{
			System.out.println("Selected direction is : North");
		}
		else if (DirectionNumber == 4)
		{
			System.out.println("Selected direction is : South");
		}
		else if (DirectionNumber == 5)
		{
			System.out.println("Selected direction is : Middle Pole");
		}
		else
		{
			System.out.println("Enter a Valid Number ");
		}
	}
}
//write a program to print the result for the obtained grade for using below table