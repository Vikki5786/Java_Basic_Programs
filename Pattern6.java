
class Pattern6 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <= 5 ;a++ )
		{
			for (int b = 1;b <= 5 ;b++ )
			{
				if (a == 1 && b == 1)
				{
					System.out.print(" @ ");
				}
				else if (a == 1 && b == 5)
				{
					System.out.print(" # ");
				}
				else if (a == 5 && b == 1)
				{
					System.out.print(" $ ");
				}
				else if (a == 5 && b == 5)
				{
					System.out.print(" ? ");
				}
				
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}
