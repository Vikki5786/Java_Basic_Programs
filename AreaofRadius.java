import java.util.Scanner;
class AreaofRadius 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius value : ");
		int radius = scan.nextInt();
		System.out.println("Enter the Area value : "+(3.14 * radius * radius));
	}
}
