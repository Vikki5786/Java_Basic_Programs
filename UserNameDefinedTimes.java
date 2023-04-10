import java.util.Scanner;
class  UserNameDefinedTimes
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("User name");
		String name = scan.next();
		System.out.println("How many times");
		int times = scan.nextInt();
		for (int i = 1;i<=times ;i++ )
		{
			//System.out.println(name);
			System.out.println(i+")"+name);
		}
	}
}
//write a program to print user name defined times.