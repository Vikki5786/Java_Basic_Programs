import java.util.Scanner;
class Ruff 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Base Number : ");
		double base = scan.nextDouble();
		System.out.println("Enter the Height Number : ");
		double height = scan.nextDouble();
		double area = 0.5*base*height;
		System.out.println("Area of triangle Numbers : "+area);

		System.out.println("Enter a Number");
		char num= scan.next().charAt(0);
		System.out.println(num);
	}
}
