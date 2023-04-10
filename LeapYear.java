class LeapYear
{
	public static void main(String[] args)
	{
		int i;
		i =2000;
		while(i<=2400)
		{
			if(i%4==0 && i%100!=0)
				System.out.println(i);i++;
		}
	}
}