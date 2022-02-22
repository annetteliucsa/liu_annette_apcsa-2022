import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven test = new ListOddToEven();
		System.out.println(test.go(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11)));
		ListOddToEven test2 = new ListOddToEven();
		System.out.println(test2.go(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7)));
		ListOddToEven test3 = new ListOddToEven();
		System.out.println(test3.go(Arrays.asList(10,20,30,40,5,41,31,20,11,7)));
		ListOddToEven test4 = new ListOddToEven();
		System.out.println(test4.go(Arrays.asList(32767,70,4,5,6,7)));
		ListOddToEven test5 = new ListOddToEven();
		System.out.println(test5.go(Arrays.asList(2,7,11,21,5,7)));
		ListOddToEven test6 = new ListOddToEven();
		System.out.println(test6.go(Arrays.asList(7,255,11,255,100,3,2)));
		ListOddToEven test7 = new ListOddToEven();
		System.out.println(test7.go(Arrays.asList(9,11,11,11,7,1000,3)));
		ListOddToEven test8 = new ListOddToEven();
		System.out.println(test8.go(Arrays.asList(7,7,7,11,2,7,7,11,11,2)));
		ListOddToEven test9 = new ListOddToEven();
		System.out.println(test9.go(Arrays.asList(2,4,6,8,8)));
		
	}
}