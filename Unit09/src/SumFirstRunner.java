//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.Arrays;

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ListSumFirst test = new ListSumFirst();
		System.out.println(test.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5)));
		ListSumFirst test2 = new ListSumFirst();
		System.out.println(test2.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		ListSumFirst test3 = new ListSumFirst();
		System.out.println(test3.go(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		ListSumFirst test4 = new ListSumFirst();
		System.out.println(test4.go(Arrays.asList(32767)));
		ListSumFirst test5 = new ListSumFirst();
		System.out.println(test5.go(Arrays.asList(255,255)));
		ListSumFirst test6 = new ListSumFirst();
		System.out.println(test6.go(Arrays.asList(9,10,-88,100,-555,2)));
		ListSumFirst test7 = new ListSumFirst();
		System.out.println(test7.go(Arrays.asList(10,10,10,11,456)));
		ListSumFirst test8 = new ListSumFirst();
		System.out.println(test8.go(Arrays.asList(-111,1,2,3,9,11,20,1)));
		ListSumFirst test9 = new ListSumFirst();
		System.out.println(test9.go(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6)));
		ListSumFirst test10 = new ListSumFirst();
		System.out.println(test10.go(Arrays.asList(12,15,18,21,23,1000)));
		ListSumFirst test11 = new ListSumFirst();
		System.out.println(test11.go(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0)));
		ListSumFirst test12 = new ListSumFirst();
		System.out.println(test12.go(Arrays.asList(9,10,-8,10000,-5000,-3000)));
	}
}