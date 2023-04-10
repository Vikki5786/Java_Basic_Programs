import java.util.Scanner;
class SimpleIntrest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Value : ");
		int P = scan.nextInt();
		System.out.println("Enter the Rate of Intrest : ");
		int R = scan.nextInt();
		System.out.println("Enter the Time : ");
		int T = scan.nextInt();
		System.out.println("This is Simple Intrest Amount : "+ (P * R * T)/100);

		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Value : ");
		int principle = scan.nextInt();
		System.out.println("Enter the Rate of Intrest : ");
		double radius = scan.nextDouble();
		System.out.println("Enter the Time : ");
		double time = scan.nextDouble();
		double SI = (principl
			e*radius*time)/100;
		System.out.println(SI);

	}
}
// A= P(1+RT)
// (P × R × T)/100 