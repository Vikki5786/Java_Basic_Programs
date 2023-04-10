import java.util.Scanner;
class CountFactorsNumbersUser 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		System.out.println("==================");
		int count =0;
		for (int a =1;a<=num ;a++ )
		{
			if (num%a==0)
			{
				System.out.println(a);
				count++;
			}
		}System.out.println("==================");
		System.out.println(count);
	}
}
//USER