import java.util.Scanner;
class NaturalNumber23to27 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter min number");
		int min = scan.nextInt();
		System.out.println("Enter max number");
		int max = scan.nextInt();
		System.out.println("===================");
		for (int a = min; a <= max ;a++ )
		{
			System.out.println(a);
		}
	}
}
