class CountFactorsNumbers 
{
	public static void main(String[] args) 
	{
		int x =12;
		int count =0;
		for (int a=1;a<=x ;a++ )
		{
			if (x%a==0)
			{
				System.out.println(a);
				count++;
			}
		}
		System.out.println("======");
		System.out.println(count);
	}
}
