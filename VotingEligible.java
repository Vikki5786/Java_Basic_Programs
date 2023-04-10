import java.util.Scanner;
class  VotingEligible
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n1 = scan.nextInt();
		if (n1<=20)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
