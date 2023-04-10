import java.util.Scanner;
class IasExam 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int age = scan.nextInt();
		if (age>=21 && age<=32)
		{
			System.out.println("Eligible for Exam");
		}
		else
		{
			System.out.println("Not Eligible for Exam");
		}

	}
}
