import java.util.Scanner;
class  SumOfNaturalNumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int sum =0;
		//System.out.println("Enter a Sum Number");
		//int sum = scan.nextInt();
		for (int a=1;a<=num ;a++ )
		{
			sum = sum+a;
		}
		System.out.println(sum);
	}
}
//User