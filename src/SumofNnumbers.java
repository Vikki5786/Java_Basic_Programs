
public class SumofNnumbers {
	public static void main(String args[]) {
		int k;
		k=sumOf(4);
		System.out.println("The Sum of N numbers are all : "+k);
	}
	static int sumOf(int j) {
		int sum=0;
		int i=1;
		while(i<=j) {
			sum=sum+i;
			i=i+1;
		}
		return sum;
	}
}