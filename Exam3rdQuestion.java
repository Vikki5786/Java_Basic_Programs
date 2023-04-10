class Exam3rdQuestion 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 100 ;i++ )
		{
			int x = i;
			int count = 0;
			int reverse = 0;
			int lastDigit = 0;
			if (i % x ==0)
			{
				count++;
			}
			lastDigit = x % 10;
			reverse = reverse * 10 + lastDigit;
			x = x/10;
			if (count==reverse)
			{
				System.out.println(i);
			}
		}
	}
}
