import java.util.Scanner;
class  MultipleRange
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		System.out.println("Enter min Range");
		int min = scan.nextInt();
		System.out.println("Enter max Range");
		int max = scan.nextInt();
		System.out.println("===============");
		for (int a =min;a<=max ;a++ )
		{
			if (a%number==0)
			{
				System.out.println(a);
			}
		}
	}
}
