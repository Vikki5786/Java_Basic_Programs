class Pattern12 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <= 5 ;a++ )
		{
			for (int b = 1;b <= 5 ;b++ )
			{
				if (b == 1 || b == 5 || b == a)
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
