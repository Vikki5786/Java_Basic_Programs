import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = scan.nextInt();
		int sum = 0;
		//int i =1;
		for (int a =1 ;a <= num / 2 ;a++ )
		{
			if (num % a == 0)
			{
				sum = sum + a;
			}
		}
		if (sum == num)
		{
			System.out.println("It is a Perfect Number");
		}else
			System.out.println("It is not Perfect Number");
	}
}
