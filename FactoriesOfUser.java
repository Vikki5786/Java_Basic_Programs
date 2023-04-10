import java.util.Scanner;
class  FactoriesOfUser
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		for (int a = 1; a <= num ; a++ )
		{
			if (num % a == 0)
			{
			System.out.println(a);
			}
		}
	}
}
//Same for FactorialFiveForLoop