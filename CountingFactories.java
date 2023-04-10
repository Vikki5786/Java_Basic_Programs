class CountingFactories 
{
	public static void main(String[] args) 
	{
		int x = 12;
		int count = 0;
		for (int i = 1;i <= x;i++ )
		{
			if (x % i == 0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
