
public class LeapYearTrue {
	public static void main(String args[]) {
		if(leapYear(2024)) {
			System.out.println("This is leap Year");
		}else {
			System.out.println("This is not a leapYear");
		}
	}
	static boolean leapYear(int i) {
		if(i%4==0 && i%100!=0) {
			return true;
		}else {
			return false;
		}
	}
}
