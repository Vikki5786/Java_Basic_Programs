class Pattern5 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <= 5 ;a++ )
		{
			for (int b = 1;b <= 5 ;b++ )
			{
				if (a == 2 && b == 2)
				{
					System.out.print(" # ");
				}
				else if (a == 3 && b == 4)
				{
					System.out.print(" ? ");
				}
				else
				{
					System.out.print(" * ");
				}
				
			}
			System.out.println("");
		}
	}
}
