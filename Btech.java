import java.util.Scanner;
public class Btech
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" =============================***&&******&&***================================");
		System.out.println("			Welcome to Tirupati                    ");
		System.out.println("			Sree Vidyanikethan Engineering College ");
		System.out.println(" =============================***&&******&&***================================");
		System.out.println("			Enter 1 for B.Tech" );
		System.out.println("			Enter 2 for Degree");
		System.out.println(" =============================***&&******&&***================================");
		System.out.println("			Enter Your Choice : ");
		int choice = scan.nextInt();
		if (choice == 1)
		{
			System.out.println("Hey...Hello!!! Thanks for Coming to Our College");
			System.out.println("Which Group do You Want to Join in B.Tech");
			System.out.println(" =============================***&&******&&***================================");
			System.out.println("If You Want to Join CSE (Computer Science and Engineering) Group Click 1 Enter ");
			System.out.println("If You Want to Join CSSE (Computer Science and System Engineering) Group Click 2 Enter ");
			System.out.println("If You Want to Join IT (Information technology) Group Click 3 Enter ");
			System.out.println("If You Want to Join EEE (Electrical and Electronics Engineering) Group Click 4 Enter ");
			System.out.println("If You Want to Join ECE (Electronics and Communication Engineering) Group Click 5 Enter ");
			System.out.println("If You Want to Join EIE (Electronics and Instrumentation Engineering) Group Click 6 Enter ");
			System.out.println("If You Want to Join CIVIL (Civil Engineering) Group Click 7 Enter ");
			System.out.println("If You Want to Join MECH (Mechanical Engineering) Group Click 8 Enter ");
			System.out.println("		Enter Your Group : ");
			int group1 = scan.nextInt();
			if (group1 ==1) 
			{
				System.out.println("Hey...!! If Want to Join CSE Group ");
				System.out.println("Please.. Tell Me Your 12th Percentage : ");
				double p1 = scan.nextDouble();
				System.out.println("Please.. Tell Me Your 12th Total Marks : ");
				double m1 = scan.nextDouble();
				System.out.println("Also Tell Me About Eamcet Rank : ");
				double e1 = scan.nextDouble();
				System.out.println("Passed out Year : ");
				int y1  = scan.nextInt();
				if (p1>=85.0 && m1>=850 && e1<=8500 && y1 ==2018) 
				{
					System.out.println("Your Eligible for CSE Group");
				}
				else
				{
					System.out.println("Your Not Eligible for CSE Group");
				}
			}
			else if (group1 == 2)
			{
				System.out.println("Hey...!! If Want to Join CSSE Group ");
				System.out.println("Please.. Tell Me Your 12th Percentage : ");
				double p2 = scan.nextDouble();
				System.out.println("Please.. Tell Me Your 12th Total Marks : ");
				double m2 = scan.nextDouble();
				System.out.println("Also Tell Me About Eamcet Rank : ");
				double e2 = scan.nextDouble();
				System.out.println("Passed out Year : ");
				int y2  = scan.nextInt();
				if (p2>=80.0 && m2>=800 && e2<=21000 && y2 ==2018) 
			    {
						System.out.println("Your Eligible for CSSE Group");
				}
				else
				{
						System.out.println("Your Not Eligible for CSSE Group");
				}
			}
			else if (group1 == 3)
			{
						System.out.println("Hey...!! If Want to Join IT Group ");
						System.out.println("Please.. Tell Me Your 12th Percentage : ");
						double p3 = scan.nextDouble();
						System.out.println("Please.. Tell Me Your 12th Total Marks : ");
						double m3 = scan.nextDouble();
						System.out.println("Also Tell Me About Eamcet Rank : ");
						double e3 = scan.nextDouble();
						System.out.println("Passed out Year : ");
						int y3  = scan.nextInt();
						if (p3>=79.0 && m3>=750 && e3<=17000 && y3 ==2018)
						{
							System.out.println("Your Eligible for IT Group");
						}
						else
						{
							System.out.println("Your Not Eligible for IT Group");
						}
			}
			else if (group1 == 4)
			{
							System.out.println("Hey...!! If Want to Join EEE Group ");
							System.out.println("Please.. Tell Me Your 12th Percentage : ");
							double p4 = scan.nextDouble();
							System.out.println("Please.. Tell Me Your 12th Total Marks : ");
							double m4 = scan.nextDouble();
							System.out.println("Also Tell Me About Eamcet Rank : ");
							double e4 = scan.nextDouble();
							System.out.println("Passed out Year : ");
							int y4  = scan.nextInt();
							if (p4>=75.0 && m4>=750 && e4<=22400 && y4 ==2018)
							{
								System.out.println("Your Eligible for EEE Group");
							}
							else
							{
								System.out.println("Your Not Eligible for EEE Group");
							}
			}
			else if (group1 == 5)
			{
								System.out.println("Hey...!! If Want to Join ECE Group ");
								System.out.println("Please.. Tell Me Your 12th Percentage : ");
								double p5 = scan.nextDouble();
								System.out.println("Please.. Tell Me Your 12th Total Marks : ");
								double m5 = scan.nextDouble();
								System.out.println("Also Tell Me About Eamcet Rank : ");
								double e5 = scan.nextDouble();
								System.out.println("Passed out Year : ");
								int y5  = scan.nextInt();
								if (p5>=75.0 && m5>=710 && e5<=22850 && y5 ==2018)
								{
									System.out.println("Your Eligible for ECE Group");
								}
								else
								{
									System.out.println("Your Not Eligible for ECE Group");
								}
			}
			else if (group1 == 6)
			{
									System.out.println("Hey...!! If Want to Join EIE Group ");
									System.out.println("Please.. Tell Me Your 12th Percentage : ");
									double p6 = scan.nextDouble();
									System.out.println("Please.. Tell Me Your 12th Total Marks : ");
									double m6 = scan.nextDouble();
									System.out.println("Also Tell Me About Eamcet Rank : ");
									double e6 = scan.nextDouble();
									System.out.println("Passed out Year : ");
									int y6  = scan.nextInt();
									if (p6>=65.0 && m6>=650 && e6<=45000 && y6 ==2018)
									{
										System.out.println("Your Eligible for EIE Group");
									}
									else
									{
										System.out.println("Your Not Eligible for EIE Group");
									}
			}
			else if (group1 == 7)
			{
										System.out.println("Hey...!! If Want to Join CIVIL Group ");
										System.out.println("Please.. Tell Me Your 12th Percentage : ");
										double p7 = scan.nextDouble();
										System.out.println("Please.. Tell Me Your 12th Total Marks : ");
										double m7 = scan.nextDouble();
										System.out.println("Also Tell Me About Eamcet Rank : ");
										double e7 = scan.nextDouble();
										System.out.println("Passed out Year : ");
										int y7  = scan.nextInt();
										if (p7>=78.0 && m7>=728 && e7<=35850 && y7 ==2018)
										{
											System.out.println("Your Eligible for CIVIL Group");
										}
										else
										{
											System.out.println("Your Not Eligible for CIVIL Group");
										}
			}
			else if(group1==8)
		    {
											System.out.println("Hey...!! If Want to Join MECH Group ");
											System.out.println("Please.. Tell Me Your 12th Percentage : ");
											double p8 = scan.nextDouble();
											System.out.println("Please.. Tell Me Your 12th Total Marks : ");
											double m8 = scan.nextDouble();
											System.out.println("Also Tell Me About Eamcet Rank : ");
											double e8 = scan.nextDouble();
											System.out.println("Passed out Year : ");
											int y8  = scan.nextInt();
											if (p8>=81.0 && m8>=813 && e8<=28570 && y8 ==2018)
											{
												System.out.println("Your Eligible for MECH Group");
											}
											else
											{
												System.out.println("Your Not Eligible for MECH Group");
											}
		    }
		}
		else
		{
			System.out.println("Hey...Hello!!! Thanks for Coming to Our College");
			System.out.println("Which Group do You Want to Join in Degree");
			System.out.println(" =============================***&&******&&***================================");
			System.out.println("If You Want to Join B.A. (Bachelor of Arts) Group Click 1 Enter ");
			System.out.println("If You Want to Join B.Com. (Bachelor of Commerce) Group Click 2 Enter ");
			System.out.println("If You Want to Join B.Sc. (Bachelor of Science) Group Click 3 Enter ");
			System.out.println("If You Want to Join B.Ed. (Bachelor of Education) Group Click 4 Enter ");
			System.out.println("If You Want to Join B.A.-B.Ed. Integrated Course Group Click 5 Enter ");
			System.out.println("If You Want to Join B.Sc.-B.Ed. Integrated Course Group Click 6 Enter ");
			System.out.println("		Enter Your Group : ");
			int group2 = scan.nextInt();
			if (group2 == 1)
			{
				System.out.println("Hey.. Hi!!! If you Want to Join B.A. ");
				System.out.println("Enter Your Inter Marks : ");
				int m1 = scan.nextInt();
				System.out.println("Enter 10th Percentage ");
				double p1 = scan.nextDouble();
				System.out.println("Enter Inter Passed out Year");
				int y1 = scan.nextInt();
				if (m1>=650 && p1>=65 && y1>=2017)
				{
					System.out.println("You are Eligible for B.A. Group ");
				}
				else
				{
					System.out.println("You are Not Eligible for B.A. Group ");
				}
			}
			else if (group2 ==2)
			{
				System.out.println("Hey.. Hi!!! If you Want to Join B.Com. ");
				System.out.println("Enter Your Inter Marks : ");
				int m2 = scan.nextInt();
				System.out.println("Enter 10th Percentage ");
				double p2 = scan.nextDouble();
				System.out.println("Enter Inter Passed out Year");
				int y2 = scan.nextInt();
				if (m2>=650 && p2>=65 && y2>=2017)
				{
					System.out.println("You are Eligible for B.Com ");
				}
				else
				{
					System.out.println("You are Not Eligible for B.Com ");
				}
			}
			else if (group2 == 3)
			{
				System.out.println("Hey.. Hi!!! If you Want to Join B.Sc. ");
				System.out.println("Enter Your Inter Marks : ");
				int m3 = scan.nextInt();
				System.out.println("Enter 10th Percentage ");
				double p3 = scan.nextDouble();
				System.out.println("Enter Inter Passed out Year");
				int y3 = scan.nextInt();
					if (m3>=650 && p3>=65 && y3>=2017)
				{
					System.out.println("You are Eligible for B.Sc. ");
				}
				else
				{
					System.out.println("You are Not Eligible for B.Sc. ");
				}
			}
			else if (group2 == 4)
			{
				System.out.println("Hey.. Hi!!! If you Want to Join B.Ed. ");
				System.out.println("Enter Your Inter Marks : ");
				int m4 = scan.nextInt();
				System.out.println("Enter 10th Percentage ");
				double p4 = scan.nextDouble();
				System.out.println("Enter Inter Passed out Year");
				int y4 = scan.nextInt();
					if (m4>=650 && p4>=65 && y4>=2017)
				{
					System.out.println("You are Eligible for B.Ed. ");
				}
				else
				{
					System.out.println("You are Not Eligible for B.Ed. ");
				}
			}
			else if (group2 == 5)
			{
				System.out.println("Hey.. Hi!!! If you Want to Join B.A.-B.Ed. ");
				System.out.println("Enter Your Inter Marks : ");
				int m5 = scan.nextInt();
				System.out.println("Enter 10th Percentage ");
				double p5 = scan.nextDouble();
				System.out.println("Enter Inter Passed out Year");
				int y5 = scan.nextInt();
					if (m5>=650 && p5>=65 && y5>=2017)
				{
					System.out.println("You are Eligible for B.A.-B.Ed. ");
				}
				else
				{
					System.out.println("You are Not Eligible for B.A.-B.Ed. ");
				}
			}
			else if (group2 == 6)
			{
				System.out.println("Hey.. Hi!!! If you Want to Join B.Sc.-B.Ed. ");
				System.out.println("Enter Your Inter Marks : ");
				int m5 = scan.nextInt();
				System.out.println("Enter 10th Percentage ");
				double p5 = scan.nextDouble();
				System.out.println("Enter Inter Passed out Year");
				int y5 = scan.nextInt();
					if (m5>=650 && p5>=65 && y5>=2017)
				{
					System.out.println("You are Eligible for B.Sc.-B.Ed. ");
				}
				else
				{
					System.out.println("You are Not Eligible for B.Sc.-B.Ed. ");
				}
			}
			else
			{
				System.out.println("Sorry...Your are Not Qualified...!!!");
			}
        }
		System.out.println("Thank You...Have a Nice Day!!!!!" );
	}
}
