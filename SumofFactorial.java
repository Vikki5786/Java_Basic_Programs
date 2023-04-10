
class SumofFactorial 
{
	public static void main(String[] args) 
	{
		int  num = 345;
		int lastDigit = 0;
		int sum = 0;
		while (num > 0)
		{
			lastDigit = num % 10;
			int factorial = 1;
			for (int i = 1;i <= lastDigit ;i++ )
			{
				factorial = factorial * i;
			}
			sum = sum + factorial;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
