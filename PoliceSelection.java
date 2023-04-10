import java.util.Scanner;
class  PoliceSelection
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================================================================");
		System.out.println("				Welcome to Police");
		System.out.println("				Eligibility Test");
		System.out.println("=================================================================================");
		System.out.println("				Enter 1 for Male");
		System.out.println("				Enter 2 for Fe-male");
		System.out.println("=================================================================================");
		System.out.println("Enter Your Choice");
		int choice = scan.nextInt();
		if (choice==1)
		{
			System.out.println("Hey...Hi!!! Happy to see you Man");
			System.out.println("Enter your Height in cm");
			double h1 = scan.nextDouble();
			System.out.println("Enter Your 12th Percentage");
			double p1 = scan.nextDouble();
			if (h1>=165&&p1>=60.0)
			{
				System.out.println("You Are all Eligibile for Writing Police Exam");
			}
			else
			{
				System.out.println("You Are all Not Eligibile for Writing Police Exam");
			}
		}
		else
		{
			System.out.println("Hey...Hi!!! Happy to see you Beatiful Lady");
			System.out.println("Enter your Height in cm");
			double h2 = scan.nextDouble();
			System.out.println("Enter Your 12th Percentage");
			double p2 = scan.nextDouble();
			if (h2>=145&&p2>=50.0)
			{
				System.out.println("You Are all Eligibile for Writing Police Exam");
			}
			else
			{
				System.out.println("You Are all Not Eligibile for Writing Police Exam");
			}
		}
		System.out.println("Thank You ..!! have a great day......!!!!!!!!!!");
	}
}
