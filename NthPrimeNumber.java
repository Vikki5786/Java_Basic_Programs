import java.util.Scanner;
class NthPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Nth Value");
		int nth = scan.nextInt();
		int x = 2;
		int primeCount = 1;
		while (primeCount <= nth)
		{
			int count = 0;
			for (int a = 1;a <= x ;a++ )
			{
				if (x % a == 0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				if (primeCount == nth)
				{
					System.out.println(primeCount+ ") "+ x);
				}
				primeCount++;
			}
			x++;
		}
	}
}
