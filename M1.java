class M1 
{
	public static void main(String[] args) 
	{
		int i=1;
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a==2 && b==1)
				{
					System.out.print(" a ");
				}
				else if (a==3&&b==1)
				{
					System.out.print(" b ");
				}
				else if(a==3&&b==2)
				{
					System.out.print(" c ");
				}
				else if (a==3&&b==3)
				{
					System.out.print(" 1 ");
				}
				else if (a==3&&b==4)
				{
					System.out.print(" 2 ");
				}
				else if (a==3&&b==5)
				{
					System.out.print(" 3 ");
				}
				else if (a==4&&b==1)
				{
					System.out.print(" d ");
				}
				else if (a==4&&b==2)
				{
					System.out.print(" e ");
				}
				else if(a==4&&b==3)
				{
					System.out.print(" f ");
				}
				else if (a==4&&b==4)
				{
					System.out.print(" 4 ");
				}
				else if (a==4&&b==5)
				{
					System.out.print(" 5 ");
				}
				else if (a==5&&b==1)
				{
					System.out.print(" g ");
				}
				else if (a==5&&b==2)
				{
					System.out.print(" h ");
				}
				else if (a==5&&b==3)
				{
					System.out.print(" i ");
				}
				else if (a==5&&b==4)
				{
					System.out.print(" j ");
				}
				else if (a==5&&b==5)
				{
					System.out.print(" 6 ");
				}
				else
				{
					System.out.print(" "+i+" ");
					i++;
				}
			}
			System.out.println();
		}
	}
}
