import java.util.Scanner;
class Even
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n1=scan.nextInt();
		if (n1%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}

	}
}
