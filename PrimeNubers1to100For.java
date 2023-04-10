class PrimeNubers1to100For 
{
	public static void main(String[] args) 
	{
		for (int j = 1;j<=100 ;j++ )
		{
			int count = 0;
			for (int a =1;a<=j ;a++ )
			{
				if (j%a==0)
				{
					count++;

				}
			}
			if (count == 2)
			{
				System.out.println(j);
			}
		}
	}
}
