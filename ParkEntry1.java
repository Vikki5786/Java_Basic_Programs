import java.util.Scanner;
class  ParkEntry1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Category");
		String Category = scan.next();
		if (Category.equals ("Male"))
		{
			System.out.println("100 Rs");
		}
		else if (Category.equals("Female"))
		{
			System.out.println("80 Rs");
		}
		else if (Category.equals ("Trans"))
		{
			System.out.println("20 Rs");
		}
		else if (Category.equals("Children"))
		{
			System.out.println("5 Rs");
		}
		else if (Category.equals("Senior_Citizen"))
		{
			System.out.println("0 Rs");
		}
		else
		{
			System.out.println("Enter valid");
		}
	}
}
//write a program to print park entry fee based on the chategory