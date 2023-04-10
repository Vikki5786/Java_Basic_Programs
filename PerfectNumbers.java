class PerfectNumbers 
{
	public static void main(String[] args) 
	{
		int i =1;int sum=0;
		for (int a=1;a<=100 ;a++ )
		{
			if (i <= a/2)
			{
				if (a%i==0)
				{
					sum = sum+a;
				}
				System.out.println(sum);
			}
			
		}
		System.out.println("====");
		System.out.println(sum);
	}
}
//DOUGHT