//1 < HCF <= 8,12
class HCF_8_12 
{
	public static void main(String[] args) 
	{
		int n1 = 8;
		int n2 = 12;
		int hcf = 0;
		for (int a = 1;a <= n1 ;a++ )
		{
			if (n1 % a == 0 && n2 % a == 0)
			{
				hcf = a;
			}
		}
		System.out.println(hcf);
	}
}
