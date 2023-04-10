import java.util.Scanner;
class  GradeSwitch
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Grade ");
		char grade = scan.next().charAt(0);
		switch (grade)
		{
		case 'A': case 'a':System.out.println("First Rank ");
		break;
		case 'B': case 'b':System.out.println("Second Rank ");
		break;
		case 'C': case 'c':System.out.println("First Class ");
		break;
		case 'D': case 'd':System.out.println("Second Class ");
		break;
		case 'E': case 'e':System.out.println("Just Pass ");
		break;
		case 'F': case 'f':System.out.println("Fail ");
		break;
		default:System.out.println("Enter a Valid Number ");
		}
	}
}
