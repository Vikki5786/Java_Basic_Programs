import java.util.Scanner; 
class  findAverage
{ 
	void findAverage(int a[]) 
	{ 
		int i=0; 
		double sum=0,average=0; 
		while(i<a.length) 
		{ 
			sum=sum+a[i++]; 
		} 
		System.out.println("Sum of numbers : "+sum); 
		average=sum/a.length; 
		System.out.println("Average of given numbers is : "+average); 
	} 
	public static void main(String args[]) 
    { 
		findAverage o1=new findAverage(); 
		Scanner in=new Scanner(System.in); 
		int a[]=new int[10]; 
		int i=0; 
		while(i<10) 
		{ 
			System.out.print("Enter value : "); 
			a[i++]=in.nextInt(); 
		} 
		o1.findAverage(a); 
	} 
} 