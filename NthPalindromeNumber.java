import java.util.Scanner;
class NthPalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Nth Palindrome Number :");
		int nth = scan.nextInt();
		int num = 1;
		int temp=num;
		int palindromeCount=1;
		while(palindromeCount<=nth)
		{
		int count = 0;
		int last = 0;
		int rev=0;
		while(num>0)
		{
			num=temp;
			last=num%10;
			rev=rev*10+last;
			num=num/10;
			//count++;
		}
		num=temp;
		if(temp==rev)
		{
			count++;
			if(palindromeCount==nth)
			{
				//count++;
				System.out.println(palindromeCount+ " ) "+temp);
			}
			palindromeCount++;
		}
		temp++;
		}
		//num++;
	}
}
