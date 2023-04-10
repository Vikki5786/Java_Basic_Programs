import java.util.Scanner;
public class Questions {
	public static void main(String args[])
	{
		int a = 3;
		System.out.println(++a * 8);
		
		int b = 3;
		System.out.println(b++ * 8);
		
//		short x = 100;
//		x = x * 5;
//		System.out.print(x);
		
		//a)500
		//b)100
		//c)Compile time error
		//d)Exception
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		char num= scan.next().charAt(0);
		System.out.println(num);
	}
}
