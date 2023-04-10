import java.util.Scanner;
class AreaofTriangle 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Base Value : ");
		int base =in.nextInt();
		System.out.println("Enter the Height Value : ");
		int height = in.nextInt();
		System.out.println("Area of Trangle is : "+(base*height)*1/2);
	}
}
//When the base and height of a triangle are given.
//A = 1/2 (base × height)