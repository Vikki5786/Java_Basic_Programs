class SumofDigitsRaisedPowerUsingCount 
{
	public static void main(String[] args) 
	{
		int num = 345;
		int temp = num;
		int count = 0;
		while (num > 0)
		{
			num = num / 10;
			count++;
		}
		num = temp;
		int sum = 0;
		int lastDigit = 0;
		while (num > 0)
		{
			lastDigit = num % 10;
			int exp = 1;
			for (int a = 1;a <= count ;a++ )
			{
				exp = exp * lastDigit;
			}
			sum = sum + exp;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
