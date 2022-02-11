//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		int numArray[] = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		RayDown test = new RayDown();
		test.setRay(numArray);
		System.out.println(test.toString());
		
		int numArray2[] = {10,9,8,7,6,5,4,3,2,1,-99};
		RayDown test2 = new RayDown();
		test2.setRay(numArray2);
		System.out.println(test2.toString());
		
		int numArray3[] = {10,20,30,40,50,-11818,40,30,20,10};
		RayDown test3 = new RayDown();
		test3.setRay(numArray3);
		System.out.println(test3.toString());
		
		int numArray4[] = {32767};
		RayDown test4 = new RayDown();
		test4.setRay(numArray4);
		System.out.println(test4.toString());
		
		int numArray5[] = {255,255};
		RayDown test5 = new RayDown();
		test5.setRay(numArray5);
		System.out.println(test5.toString());
		
		int numArray6[] = {9,10,-88,100,-555,1000};
		RayDown test6 = new RayDown();
		test6.setRay(numArray6);
		System.out.println(test6.toString());
		
		int numArray7[] = {10,10,10,11,456};
		RayDown test7 = new RayDown();
		test7.setRay(numArray7);
		System.out.println(test7.toString());
		
		int numArray8[] = {-111,1,2,3,9,11,20,30};
		RayDown test8 = new RayDown();
		test8.setRay(numArray8);
		System.out.println(test8.toString());
		
		int numArray9[] = {9,8,7,6,5,4,3,2,0,-2,-989};
		RayDown test9 = new RayDown();
		test9.setRay(numArray9);
		System.out.println(test9.toString());
		
		int numArray10[] = {12,15,18,21,23,1000};
		RayDown test10 = new RayDown();
		test10.setRay(numArray10);
		System.out.println(test10.toString());
		
		int numArray11[] = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		RayDown test11 = new RayDown();
		test11.setRay(numArray11);
		System.out.println(test11.toString());
		
		int numArray12[] = {9,10,-8,10000,-5000,1000};
		RayDown test12 = new RayDown();
		test12.setRay(numArray12);
		System.out.println(test12.toString());
	}
}