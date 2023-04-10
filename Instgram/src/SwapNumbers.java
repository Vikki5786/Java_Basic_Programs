
public class SwapNumbers {
	public static void main(String args[])
	{
		float first = 1.20f, second = 2.45f;
		
		System.out.println("--Before swap--");
		System.out.println("First Number = " + first);
		System.out.println("Second Number = " + second);
		
		//Value of first is assigned to temporary
		float temporary = first;
		
		//Value of first is assigned to temporary
		first = second;
		
		//Value of temporary (which contains the intial value of first)is ass
		second = temporary;
		
		System.out.println("--After swap--");
		System.out.println("First number = "+ first);
		System.out.println("Second number = " + second);
		
		//Simple Method
		int x = 10;
		int y = 20;
		int z = 0;
		
		z = x;
		x = y;
		y = z;
		System.out.println("x = "+x);
		System.out.println("y = " + y);
		
	}
}
