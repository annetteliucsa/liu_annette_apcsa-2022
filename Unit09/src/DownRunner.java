import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		ListDown test = new ListDown();
		System.out.println(test.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345)));
		ListDown test2 = new ListDown();
		System.out.println(test2.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		ListDown test3 = new ListDown();
		System.out.println(test3.go(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		ListDown test4 = new ListDown();
		System.out.println(test4.go(Arrays.asList(32767)));
		ListDown test5 = new ListDown();
		System.out.println(test5.go(Arrays.asList(255,255)));
		ListDown test6 = new ListDown();
		System.out.println(test6.go(Arrays.asList(9,10,-88,100,-555,1000)));
		ListDown test7 = new ListDown();
		System.out.println(test7.go(Arrays.asList(10,10,10,11,456)));
		ListDown test8 = new ListDown();
		System.out.println(test8.go(Arrays.asList(-111,1,2,3,9,11,20,30)));
		ListDown test9 = new ListDown();
		System.out.println(test9.go(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989)));
		ListDown test10 = new ListDown();
		System.out.println(test10.go(Arrays.asList(12,15,18,21,23,1000)));
		ListDown test11 = new ListDown();
		System.out.println(test11.go(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455)));
		ListDown test12 = new ListDown();
		System.out.println(test12.go(Arrays.asList(9,10,-8,10000,-5000,1000)));
	}
}