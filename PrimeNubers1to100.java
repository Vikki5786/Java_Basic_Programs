class PrimeNubers1to100 
{
	public static void main(String[] args) 
	{
		int i=1 , j;
		while (i<=100)
		{
			j = 2;
			while (j<i)
			{
				if (i%j==0)
					break;
				j++;	
			}
			if (j==i)
			
				System.out.println(i);
				i++;
		}
	}
}
//MAMA