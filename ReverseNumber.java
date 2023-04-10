class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 5786;
		int reverse = 0;
		int lastdigit = 0;
		while (num>0)
		{
			lastdigit = num % 10;
			reverse = (reverse * 10) + lastdigit;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}
