import java.util.Scanner;
class  Factorial5User
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int fact = scan.nextInt();
		int prod = 1;
		for (int a = 1; a <= fact ; a++ )
		{
			prod = prod * a;
		}
		System.out.println(prod);
	}
}
