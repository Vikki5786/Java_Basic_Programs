import java.util.Scanner;
class  PositiveorNegitiveNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		if (num > 0)
		{
			System.out.println(num+" is Positive Number");
		}
		else
		{
			System.out.println(num+" is Negitive Number");
		}
	}
}
