class LCF_8_12 
{
	public static void main(String[] args) 
	{
		int n1 = 8;
		int n2 = 12;
		int lcf = 0;
		for (int a = n1;a <= (n1*n2) ;a++ )
		{
			if (a % n1 == 0 && a % n2 == 0)
			{
				lcf = a;
				break;
			}
		}
		System.out.println(lcf);
	}
}
