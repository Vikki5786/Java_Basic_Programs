import java.util.Scanner;
public class EvenorNotGivenNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = scan.nextInt();
		if (num % 2 ==0) {
			System.out.println("Entered Number is Even Number");
		}
		else
		{
			System.out.println("Not a Even Number");
		}
	}
}
