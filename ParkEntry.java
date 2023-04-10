import java.util.Scanner;
class  ParkEntry
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Category");
		char Category = scan.next().charAt(0);
		if (Category == 'M' || Category =='m')
		{
			System.out.println("100");
		}
		else if (Category == 'F' || Category == 'f')
		{
			System.out.println("80");
		}
		else if (Category == 'T' || Category =='t')
		{
			System.out.println("20");
		}
		else if (Category == 'C' || Category =='c')
		{
			System.out.println("5");
		}
		else if (Category == 'S' || Category =='s')
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("Enter valid");
		}
	}
}
//// ||||||