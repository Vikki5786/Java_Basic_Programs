import java.util.Scanner;
class ReverseNNumbersUser 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		for (int a = num;a>=1 ; a--)
		{
			System.out.println(a);
		}
	}
}
//USER