class FactoriesofNumber 
{
	public static void main(String[] args) 
	{
		int x = 12;
		for (int i = 1;i <= x ;i++ )
		{
			if (x % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
