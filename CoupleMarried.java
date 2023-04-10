class CoupleMarried 
{
	public static void main(String[] args) 
	{
		int male_age =23;
		int female_age =21;
		String b =(male_age>=23 && female_age>=21)?"COUPLES ELIGIBLE FOR MARRIAGE":"COUPLES NOT ELIGIBLE FOR MARRIAGE";
		System.out.println(b);

		int male =23;
		int female =10;
		String c =(male>=23 && female>=21) && (male>=22 && female>=20)?"Eligible":"Not Eligible";
		System.out.println(c);
	}
}
