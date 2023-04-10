import java.util.Scanner;
class PrimeNumbersUser
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		int count = 0;
		for (int a = 1;a <= n ;a++ )
		{
			if (n%a==0)
			{
				count++;
			}
		}
		if (count == 2)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is a Not Prime Number");
		}
	}
}
