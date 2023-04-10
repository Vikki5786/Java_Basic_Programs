import java.util.Scanner;
class MultipliesofFiveUser 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("=========");
		for (int a=1;a<=200 ;a++ )
		{
			if (a%num==0)
			{
				System.out.println(a);
			}
		}
	}
}
