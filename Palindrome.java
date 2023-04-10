class Palindrome 
{
	public static void main(String[] args) 
	{
		int num =777;
		int rev = 0;
		int last = 0;
		int temp = num;
		while (num > 0)
		{
			last = num % 10;
			rev = (rev * 10)+ last;
			num = num / 10;
		}
		num = temp;
		if (num == rev)
		{
			System.out.println(num + " is Palindrome");
		}
		else
		{
			System.out.println(num + " is Not Palindrome");
		}
	}
}
