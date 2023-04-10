import java.util.Scanner;
class SwitchCase1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user Grade ");
		char grade = scan.next().charAt(0);
		switch (grade)
		{
		case 'A' :case 'a' :System.out.println("First Rank");
		break;
		case 'B' :case 'b' :System.out.println("Second Rank");
		break;
		case 'C' :case 'c' :System.out.println("First Class");
		break;
		case 'D' :case 'd' :System.out.println("second class");
		break;
		case 'E' :case 'e' :System.out.println("just pass");
		break;
		case 'F' :case 'f' :System.out.println("fail");
		break;
		default:System.out.println("Enter a valid");
		}
	}
}
//in switch case we cannot use && operator and OR operator
//write a program to print park entry fee program using switch.