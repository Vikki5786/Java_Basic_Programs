class ArmStrongNumbers1to10000 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <= 10000 ;a++ )
		{
			int num = a;
			int count = 0;
			int temp = num;
			while (num > 0)
			{
				num = num / 10;
				count++;
			}
			num = temp;
			int sum = 0;
			int last = 0;
			while (num > 0)
			{
				last = num % 10;
				int exp = 1;
				for (int i = 1;i <= count ;i++ )
				{
					exp = exp * last;
				}
				sum = sum + exp;
				num = num / 10;
			}
			//sum==temp
			if (temp == sum)
			{
				System.out.println(temp + ": ArmStrong Number");
			}
		}
	}
}
