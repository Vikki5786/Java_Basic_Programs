import java.util.Scanner;
public class NameAgeUser {
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Name:");
		String name = scan.nextLine();
		System.out.println("Enter Your Age:");
		int age = scan.nextInt();
		System.out.println("Enter Your Name:"+name);
		System.out.println("Enter Your Name:"+age);
		
	}
}
