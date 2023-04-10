import java.util.Scanner;
class  TabelsUser
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any Table Number");
		int table = scan.nextInt();
		for (int a =1;a<=10 ;a++ )
		{
			System.out.println(table+" * "+a+" = "+(table*a));
		}
	}
}
