class StrongNumbers 
{
	public static void main(String[] args) 
	{
		int  num = 145;
		int last = 0;
		int sum=0;
		int temp = num;
		while(num>0)
		{
			last=num%10;
			int f = 1;
			for (int i=1;i<=last ;i++ )
			{
				f=f*i;
			}
			sum=sum+f;
			num=num/10;
		}
		//num=t;
		//(num==sum)
		if (temp == sum)
		{
			System.out.println(temp+" : is a Strong Number");
		}
		else
		{
			System.out.println(temp+": is Not a Strong Number");
		}
		//}
	}
}
