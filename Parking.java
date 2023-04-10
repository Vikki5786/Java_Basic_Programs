import java.util.Scanner;
class  Parking
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Gender");
		String Citizen = scan.next();
		switch (Citizen)
		{
		case "MALE":case "male":System.out.println("100");
		break;
		case "FEMALE":case "female":System.out.println("80");
		break;
		default:System.out.println("valid number");
		
		}
	}
}
