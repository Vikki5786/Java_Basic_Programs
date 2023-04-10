
public class Pattern1 {
	public static void main(String args[])
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j >= 1; j--)
			{
				if(i<=j)
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if(i>=j) {
					System.out.print(" *");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int a = 1; a <= 5; a++)
		{
			for (int b = 5; b >= 1; b--)
			{
				if(a>=b) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}
}
