class LogicalOperators 
{
	public static void main(String[] args) 
	{
		//AND OPERATORS
		System.out.println(3>2 && 6<10);
		System.out.println(10!=10 && 5==5);
		System.out.println(4<=4 &&  5!=5);
		System.out.println(4<4 && 5>5);

		//OR OPERATORS
		System.out.println(3<5 || 10<6);
		System.out.println(10>=12 || 5==5);

		//NOT OPERATORS
		System.out.println(!(4==4));
		System.out.println(!(5!=5));
		System.out.println(!(5!=6));
		
		//ASSIGNMENT VALUE
		int x =10;
		int y =30;
		x=y;
		System.out.println(x);
		System.out.println(y);

		//CONDITIONAL OPERATOR
		//Voting
		int age =35;
		String b =(age>=18)?"Eligible for voting":"Not Eligible for voting";
		System.out.println(b);
		//IAS Exam
		int age1 =30;
		String b1=(age1>=21 && age1<=32)?"Eligible for IAS exam":"Not Eligible for IAS exam";
		System.out.println(b1);

	}
}
