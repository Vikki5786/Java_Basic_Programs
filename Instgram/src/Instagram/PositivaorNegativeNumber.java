package Instagram;
import java.util.Scanner;
public class PositivaorNegativeNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int number = scan.nextInt();
		if (number > 0) {
			System.out.println(number+": is a Positive Number");
		}
		else if (number < 0) {
			System.out.println(number+": is a Negative Number");
		}
		else {
			System.out.println(number +": Number is Zero");
		}
	}
}