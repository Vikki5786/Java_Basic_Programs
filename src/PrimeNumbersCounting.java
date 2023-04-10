
public class PrimeNumbersCounting {
	public static void main(String args[]) {
		int j,count=0;
		j=2;
		while(j<=20) {
			if(isPrime(j)) {
				count++;
			}
			j++;
		}
		System.out.println("Count Prime nmbers : "+count);
	}
	static boolean isPrime(int i) {
		int j =2;
		while(j<i) {
			if(i%j==0)
				return false;
			j++;
		}
		return true;
	}
}