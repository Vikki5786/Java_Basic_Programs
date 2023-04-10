import java.util.Scanner;
class  AreaCalculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================================================");
		System.out.println("			  Welcome to");
		System.out.println("			   Area Calculator");
		System.out.println("=================================================================");
		System.out.println("			Enter 1 for Circle Area");
		System.out.println("			Enter 2 for Triangle Area");
		System.out.println("			Enter 3 for Cylinder Area");
		System.out.println("			Enter 4 for Rectangle Area");
		System.out.println("=================================================================");
		System.out.println("			Enter Your Choice");
		int choice = scan.nextInt();
		if (choice == 1)
		{
			System.out.println(" You have selected circle to find it's area");
			System.out.println(" Enter radius of circle");
			double radius = scan.nextDouble();
			System.out.println(radius + " circle radius is : " +3.14*radius*radius);
		}
		else if (choice == 2)
		{
			System.out.println(" You have selected triangle to find it's area");
			System.out.println("Enter Base of triangle");
			double base = scan.nextDouble();
			System.out.println("Enter Height of Triangle");
			double height = scan.nextDouble();
			System.out.println(" Triangle area " + (base*height)/2);
		}
		else if (choice == 3)
		{
			System.out.println(" You have selected cylinder to find it's area");
			System.out.println("Enter Cylinder radius ");
			double radius = scan.nextDouble();
			System.out.println("Enter Height ");
			double height = scan.nextDouble();
			System.out.println("Area Of Cylinder is "+(3.14*radius*radius*height));
		}
		else if (choice == 4)
		{
			System.out.println(" You have selected rectangle to find it's area");
			System.out.println("Enter length of rectangle ");
			double length = scan.nextDouble();
			System.out.println("Enter Width of rectangle ");
			double width = scan.nextDouble();
			System.out.println("Ractangle area is " + (length * width ));
		}
		else
		{
			System.out.println(" Thanku You...!!!");
		}
	}
}
//A = 1/2 × b × h