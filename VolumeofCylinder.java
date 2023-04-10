import java.util.Scanner;
class VolumeofCylinder  
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius  : ");
		int radius = scan.nextInt();
		System.out.println("Enter the Height : ");
		int height = scan.nextInt();
		System.out.println("Volume of Cylinder is : "+(3.14*radius*radius*height));

		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius  : ");
		int r = scan.nextInt();
		System.out.println("Enter the Height : ");
		int h = scan.nextInt();
		double SI = 3.14*r*r*h;
		System.out.println("Volume of Cylinder is : "+SI);


	}
}
