import java.util.Scanner;
class ScannerCountingFactories 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		int count = 0;
		for (int i = 1;i <= num ;i++ )
		{
			if (num % i == 0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
