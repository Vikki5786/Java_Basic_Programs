class ContinueNaturalNumbersExpect7 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 10 ; i++ )
		{
			if (i == 7)
			{
				continue;//Here if(7==7) it will come out & directly goes to i++ update
			}
			System.out.println(i);
		}
	}
}
