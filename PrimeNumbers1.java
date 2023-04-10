class PrimeNumbers1
{
	public static void main(String[] args) 
	{
		int n = 5;
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
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}
