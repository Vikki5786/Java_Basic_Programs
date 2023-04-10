import java.util.Scanner;
class MarriageEligible 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Male age :");
		int male_age = scan.nextInt();
		System.out.println("Enter the Female age :");
		int female_age = scan.nextInt();
		if (male_age>=23 && female_age>=21)
		{
			System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not Eligible for Marriage");
		}
	}
}
