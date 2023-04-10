class  ArmStrongNumberOrNot
{
	public static void main(String[] args) 
	{
		int num = 1634;    
		int count = 0;
		int temp = num;
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
			for (int i = 1;i <= count ;i++ )
			{
				exp = exp * lastDigit;
			}
			sum = sum + exp;
			num = num / 10;
		}
		//sum==temp
			if (temp == sum)
		{
			System.out.println(temp +" :Arm Strong Number");
		}
		else
		{
			System.out.println(temp +" :Not Arm Strong Number");
		}
	}
}
