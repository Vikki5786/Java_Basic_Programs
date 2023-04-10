import java.util.Scanner;
class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user Grade ");
		char grade = scan.next().charAt(0);
		switch (grade)
		{
		case 'A' :System.out.println("First Rank");
		break;
		case 'a' :System.out.println("First Rank");
		break;
		case 'B' :System.out.println("Second Rank");
		break;
		case 'b' :System.out.println("Second Rank");
		break;
		case 'C' :System.out.println("First Class");
		break;
		case 'c' :System.out.println("First Class");
		break;
		case 'D' :System.out.println("second class");
		break;
		case 'd' :System.out.println("second class");
		break;
		case 'E' :System.out.println("just pass");
		break;
		case 'e' :System.out.println("just pass");
		break;
		case 'F' :System.out.println("fail");
		break;
		case 'f' :System.out.println("fail");
		break;
		default:System.out.println("Enter a valid");
		}
	}
}
