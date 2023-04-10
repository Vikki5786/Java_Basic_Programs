import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		int principle;
		//float annualRate;
		float monthlyRate;
		int numberOfPayments;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("Principle: ");
		principle = scan.nextInt();
		if(principle >= 1000 && principle <= 1000000)
			break;
			System.out.println("Enter a value between 1000 to 1000000.");
		}
		
		while(true) {
			System.out.println("Annual intrest rate : ");
			//rate = (scan.nextFloat() /100) / 12;
			float annualRate = scan.nextFloat();
			if (annualRate >= 1 && annualRate <= 30) {
				monthlyRate = annualRate / 100 / 12 ;
				break;
			}
			System.out.println("Enter a value greater then 0 and less than or equal to 30.");
		}
		
		while(true) {
			System.out.println("Period of Years : ");
			int years = scan.nextInt();
			if(years >= 1 && years <= 30) {
				numberOfPayments = years * 12;
				break;
			}
			System.out.println("Enter a value between 1 and 30.");
		}
		//double powerValue = Math.pow((1+annualRate), numberOfPayments);
		
		double mortgage = principle *( monthlyRate * Math.pow(1+monthlyRate, numberOfPayments))
				/(Math.pow(1+monthlyRate, numberOfPayments)-1);
		NumberFormat format = NumberFormat.getCurrencyInstance();
		System.out.println("Mortgage: "+format.format(mortgage));
		
	}
}
//		rate(1+rate)n
//m = p	--------
//		(1+rate)n - 1




