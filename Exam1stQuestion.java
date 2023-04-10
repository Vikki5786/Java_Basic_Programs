class Exam1stQuestion 
{
	public static void main(String[] args) 
	{
		for (int num=1;num<=10000 ;num++ )
		{
			int temp = num;
			int lastDigit = 0;
			int sum = 0;
			while (num > 0)
			{
				lastDigit = num % 10;
				int fact = 1;
				for (int a=1;a<=lastDigit ;a++ )
				{
					fact = fact*lastDigit;
				}
				sum=sum+fact;
			}
			System.out.println(num);
		}
	}
}
