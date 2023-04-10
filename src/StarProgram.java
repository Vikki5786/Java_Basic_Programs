
public class StarProgram {
	public static void main(String args[]) {
		int rows, column;
		rows =1;
		while(rows<=10) {
			column=1;
			while(column<rows) {
				System.out.print("*");
				column++;
			}
			System.out.println();
			rows++;
		}
	}
}
