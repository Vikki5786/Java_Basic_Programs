import java.util.Scanner;
class  SumOfNaturalNumbersRange
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter a number");
		//int num = scan.nextInt();
		int sum =0;
		System.out.println("Enter a min Number");
		int min = scan.nextInt();
		System.out.println("Enter a max Number");
		int max = scan.nextInt();
		for (int a=min;a<=max ;a++ )
		{
			sum = sum+a;
		}
		System.out.println(sum);
	}
}
