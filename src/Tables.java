
public class Tables {
	public static void main(String args[]) {
		int table=1,next=1;
		while(table<=10) {
			while(next<=10) {
				System.out.println(table+" *"+next+" = "+table*next);
				next++;
			}
			table++;
			System.out.println("------");
			next=1;
		}
	}
}
