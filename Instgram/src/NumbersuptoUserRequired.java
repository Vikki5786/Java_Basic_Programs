import java.util.Scanner;
public class NumbersuptoUserRequired {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter How many Number you want to Print : ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(i+",");
		}
	}
}
