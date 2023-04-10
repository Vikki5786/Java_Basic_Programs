
public class FactorialNumbers {
	public static void main(String args[]) {
		int m;
		m=factorial(5);
		System.out.println(m);
	}
	static int factorial(int j) {
		int fact;
		fact=1;
		int i=1;
		while(i<=j) {
			fact=fact*i;
			i=i+1;
		}
		return fact;
	}
}