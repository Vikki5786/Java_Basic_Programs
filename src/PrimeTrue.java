
public class PrimeTrue {
	public static void main(String args[]) {
		if(primeNumber(7)) {
			System.out.println("It is a Prime Numbers");
		}else {
			System.out.println("it is Not a prime Numbers");
		}
	}
	static boolean primeNumber(int j) {
		int i=2;
		while(i<j) {
			if(j%i==0)
				return false;
			i++;
		}
		return true;
	}
}
