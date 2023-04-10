class Practise6 
{
	public static void main(String[] args) 
	{
		char x='a';
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=5;b>=1 ;b-- )
			{
				if (a<=b)
				{
					System.out.print(" "+x);
				x++;
				}	
			}
			System.out.println();
		}
		
	}
}
