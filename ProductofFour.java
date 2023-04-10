import java.util.Scanner;
class  ProductofFour
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int first =scan.nextInt();
		System.out.println("Enter the secod Number : ");
		int second =scan.nextInt();
		System.out.println("Enter the third Number : ");
		int third =scan.nextInt();
		System.out.println("Enter the  forth Number : ");
		int fourth =scan.nextInt();
		System.out.println("Product of four Numbers : "+(first*second*third*fourth));

	//	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Four Numbers One by One : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int product = n1*n2*n3*n4;
		System.out.println("Product of Four Numbers : "+product);

	}
}
