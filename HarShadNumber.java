import java.util.Scanner;
class HarShadNumber 
//171 is harshad number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		int temp = num;
		int sum = 0;
		int lastDigit = 0;
		while (num > 0)
		{
			lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}
		if (temp % sum == 0)
		{
			System.out.println(temp+" is HarShad Number");
		}
		else
		{
			System.out.println(temp+" is Not HarShad Number");
		}
	}
}
