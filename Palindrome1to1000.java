class  Palindrome1to1000
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=20 ;i++ )
		{
			int temp = i;
			int last = 0;
			int rev =0;
			while (i>0)
			{
				
				last = i%10;
				rev = rev*10+last;
				i=i/10;
			}
			i = temp;
			if (i == rev)
			{
				System.out.println(i);	
			}
		}
	}
}
