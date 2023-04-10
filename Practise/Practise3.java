import java.util.Scanner;
class Practise3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = scan.nextInt();
		System.out.println("Enter a Counting Number :");
		int digit = scan.nextInt();
		int count =0 ;
		int lastDigit= 0;
		while (num>0)
		{
			lastDigit = num % 10;
			if (lastDigit==digit)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
