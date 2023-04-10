import java.util.Scanner;
class  PalindromeUser
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		int temp = num;
		int lastDigit = 0;
		int reverse = 0;
		while (num > 0)
		{
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}
		num = temp;
		if (num == reverse)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
	}
}
