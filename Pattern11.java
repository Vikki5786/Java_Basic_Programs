class Pattern11 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <= 5 ;a++ )
		{
			for (int b = 1;b <= 5 ;b++ )
			{
				if (a == 1 || a == 5 || b == 5 - a + 1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");//2ws
				}
			}
			System.out.println();
		}
	}
}
