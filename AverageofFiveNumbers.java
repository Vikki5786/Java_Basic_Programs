import java.util.Scanner;
class AverageofFiveNumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int first =scan.nextInt();
		System.out.println("Enter Second Number : ");
		int second =scan.nextInt();
		System.out.println("Enter Third Number : ");
		int third =scan.nextInt();
		System.out.println("Enter Forth Number : ");
		int forth =scan.nextInt();
		System.out.println("Enter Fifth Number : ");
		int fifth=scan.nextInt();
		System.out.println("Average Number is : "+(first+second+third+forth+fifth)/5);

		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers One by One : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		double avg = ((n1+n2+n3+n4+n5)/5);
		System.out.println("Average of Five Numbers : "+avg);
	}
}
