
public class LeapYearBetween {
	public static void main(String args[]) {
		if(leapYear()) {
			int first=305;
			int last =315;
			while(first<last) {
				System.out.println("These leapYear Numbers ");
			}
		}
	}
	static boolean leapYear() {
		int i;
		i =2;
		while(i<=50) {
			if(i%4==0 && i%100!=0) 
				System.out.println(i);
				i++;
		}
		return false;
	}
}
