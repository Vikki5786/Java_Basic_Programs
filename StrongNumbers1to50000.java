class StrongNumbers1to50000 
{
	public static void main(String[] args) 
	{
		for (int s=1;s<=50000 ;s++ )
		{
		int  num = s;
		int l = 0;
		int sum=0;
		int t = num;
		while(num>0)
		{
			l=num%10;
			int f = 1;
			for (int i=1;i<=l ;i++ )
			{
				f=f*i;
			}
			sum=sum+f;
			num=num/10;
		}
		//num=t;
		//(num==sum)
		if (t == sum)
		{
			System.out.println(s+" :Strong Number");
		}
		}
	}
}
