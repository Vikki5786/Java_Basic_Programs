class ContinueDo_WhileLoopNaturalNumbersExpect7 
{
	public static void main(String[] args) 
	{
		int i = 10;
		do
		{
			i++;
			if (i == 7)
			{
				//i++;
				System.out.println(i);
				continue;
			}
			i++;
		}

		while (i<=10);
	}
}
