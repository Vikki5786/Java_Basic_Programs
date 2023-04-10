import java.util.Scanner;
public class ConditionEvenOdd {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = scan.nextInt();
		
		String evenOdd = (num % 2 == 0)? "Even" : "Odd";
		
		System.out.println(num + " is " + evenOdd);
	}
}
