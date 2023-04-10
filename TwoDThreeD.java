import java.util.Scanner;
class  TwoDThreeD
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================================================================");
		System.out.println("			     Welocome to");
		System.out.println("			2D Shapes && 3D Shapes");
		System.out.println("=====================================================================");
		System.out.println("			Enter 1 for 2D ");
		System.out.println("			Enter 2 for 3D ");
		System.out.println("=====================================================================");
		System.out.println("			Enter Your Choice : ");
		int choice = scan.nextInt();
		if (choice == 1)
		{
			System.out.println("=====================================================================");
			System.out.println("			Welcome to See 2D Shapes : ");
			System.out.println("			Enter 1 for Circle Area ");
			System.out.println("			Enter 2 for Triangle Area ");
			System.out.println("			Enter 3 for Square Area ");
			System.out.println("			Enter 4 for Rectangle Area ");
			System.out.println("			Enter 5 for Parallelogram Area ");
			System.out.println("			Enter 6 for Trapezium Area ");
			System.out.println("			Enter 7 for Ellipse Area");
			System.out.println("=====================================================================");
			System.out.println("			Thank You For Choosing 2D Shapes ");
			System.out.println("-------------------------------------------------------------------- ");
			System.out.println("			Enter Any 2D Shape Number : ");
			int shapes2D = scan.nextInt();
			System.out.println("=====================================================================");
			if (shapes2D == 1)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the  radius of the circle : ");
				double radius = scan.nextDouble();
				double circle = (3.14 * radius * radius);
				System.out.println("			Circle Radius is = " +circle);
				System.out.println("=====================================================================");
			}
			else if (shapes2D == 2)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the Triangle Base : ");
				double base = scan.nextDouble();
				System.out.println("			Enter the Triangle Height : ");
				double height = scan.nextDouble();
				double triangle = (base * height)/2;
				System.out.println("			Triangle Area is = " +triangle);
				System.out.println("=====================================================================");
			}
			else if (shapes2D == 3)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the Square length of side : ");
				double length = scan.nextDouble();
				double square = (length * length);
				System.out.println("			Square length of side is = "+ square);
				System.out.println("=====================================================================");
			}
			else if (shapes2D == 4)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the Length of Rectangle : ");
				double length = scan.nextDouble();
				System.out.println("			Enter the Width of Rectangle : ");
				double width = scan.nextDouble();
				double rectangle = (length * width);
				System.out.println("			Rectangle area is = "+ rectangle);
				System.out.println("=====================================================================");
			}
			else if (shapes2D == 5)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the Parallelogram Base : ");
				double base = scan.nextDouble();
				System.out.println("			Enter the Parallelogram Height : ");
				double height = scan.nextDouble();
				double Parallelogram = (base * height);
				System.out.println("			Parallelogram area is = " + Parallelogram);
				System.out.println("=====================================================================");
			}
			else if (shapes2D == 6)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the Trapezium Base : ");
				double a = scan.nextDouble();
				System.out.println("			Enter the Trapezium Base : ");
				double b = scan.nextDouble();
				System.out.println("			Enter the Trapezium Height : ");
				double height = scan.nextDouble();
				double Trapezium = ((a + b) * height / 2);
				System.out.println("			Trapezium Area is = " + Trapezium);
				System.out.println("=====================================================================");
			}
			else if (shapes2D == 7)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter the Ellipse Minor Axis : ");
				double a = scan.nextDouble();
				System.out.println("			Enter the Ellipse Major Axis : ");
				double b = scan.nextDouble();
				double Ellipse = (3.14 * a * b);
				System.out.println("			Ellipse Area is = " + Ellipse);
				System.out.println("=====================================================================");
			}
			else
			{
				System.out.println("			Enter a Valid Number : ");
				System.out.println("		~~~~@@@ Please Try Again Correct Number @@@~~~~");
			}
		}
		else
		{
			System.out.println("=====================================================================");
			System.out.println("=====================================================================");
			System.out.println("			Welcome to See 3D Shapes ");
			System.out.println("			Enter 1 for Cube ");
			System.out.println("			Enter 2 for Rectangular prism ");
			System.out.println("			Enter 3 for Cylinder ");
			System.out.println("			Enter 4 for Cone ");
			System.out.println("			Enter 5 for Sphere ");
			System.out.println("			Enter 6 for Hemisphere ");
			System.out.println("=====================================================================");
			System.out.println("			Thank You For Choosing 3D Shapes ");
			System.out.println("-------------------------------------------------------------------- ");
			System.out.println("			Enter Any One 3D Shape : ");
			System.out.println("=====================================================================");
			int shape = scan.nextInt();
			if (shape == 1)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter Cube length of the edge : ");
				double length = scan.nextDouble();
				double cube = (length * length * length);
				System.out.println("			Cube Value is = " + cube);
				System.out.println("=====================================================================");
			}
			else if (shape == 2)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter Rectangular prism Length : ");
				double length = scan.nextDouble();
				System.out.println("			Enter Rectangular prism Width : ");
				double width = scan.nextDouble();
				System.out.println("			Enter Rectangular prism Height : ");
				double height = scan.nextDouble();
				double Rectangular_prism = (2*(width * length + height * length + height * width));
				System.out.println("			Rectangular prism Surface Area is = " + Rectangular_prism);
				System.out.println("=====================================================================");
			}
			else if (shape == 3)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter Cylinder  radius of circular base : ");
				double radius = scan.nextDouble();
				System.out.println("			Enter height of the cylinder : ");
				double height = scan.nextDouble();
				double Cylinder = (2*3.14*radius*(radius + height));
				System.out.println("			Cylinder Area is = " + Cylinder);
				System.out.println("=====================================================================");
			}
			else if (shape == 4)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter Cone radius of circular base : ");
				double radius = scan.nextDouble();
				System.out.println("			Enter Cone  slant height : ");
				double l = scan.nextDouble();
				double Cone = (3.14 * radius*(radius * l));
				System.out.println("			Cone Surface Area is = " + Cone);
				System.out.println("=====================================================================");
			}
			else if (shape == 5)
			{
				System.out.println("=====================================================================");
				System.out.println("			Enter Radius of sphere : ");
				double radius = scan.nextDouble();
				double Sphere = (4 * 3.14 * radius * radius);
				System.out.println("			Sphere surface Area is = " + Sphere);
				System.out.println("=====================================================================");
			}
			else if (shape == 6)
			{
				System.out.println("=====================================================================");
				System.out.println("			Radius of HemiSphere : ");
				double radius = scan.nextDouble();
				double HemiSphere = (3 * 3.14 * radius * radius);
				System.out.println("			HemiSphere Surface Area is = " + HemiSphere);
				System.out.println("=====================================================================");
			}
			else
			{
				System.out.println("			Enter a Valid Number : ");
				System.out.println("			~~~~@@@ Try Again Correct Number @@@~~~~!!!");
			}
		}
		System.out.println("			Thank You For Checking the Methods...!!!");
		System.out.println("			Have a Great Day...!!!!");
		System.out.println("=====================================================================");
	}
}