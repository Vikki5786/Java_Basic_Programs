import java.util.Scanner;
class  Forloop
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  Name");
		String name = scan.next();
		for (int a=1;a<=5 ;a++ )
		{
			System.out.println(a+" ) "+name);
		}
	}
}
//write a program to print user name 20 times