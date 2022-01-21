//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//add test cases	
		out.println("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		
		out.println("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		
		out.println("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		
		out.println("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		Distance mySecondDistance = new Distance();
		mySecondDistance.setCoordinates(x1, y1, x2, y2);
		mySecondDistance.calcDistance();
		System.out.print("distance == ");
		mySecondDistance.print();
		
		out.println("Enter X1 :: ");
		int x3 = keyboard.nextInt();
		
		out.println("Enter Y1 :: ");
		int y3 = keyboard.nextInt();
		
		out.println("Enter X2 :: ");
		int x4 = keyboard.nextInt();
		
		out.println("Enter Y2 :: ");
		int y4 = keyboard.nextInt();
		
		Distance myDistance = new Distance();
		myDistance.setCoordinates(x3, y3, x4, y4);
		myDistance.calcDistance();
		System.out.print("distance == ");
		myDistance.print();
		
		out.println("Enter X1 :: ");
		int x5 = keyboard.nextInt();
		
		out.println("Enter Y1 :: ");
		int y5 = keyboard.nextInt();
		
		out.println("Enter X2 :: ");
		int x6 = keyboard.nextInt();
		
		out.println("Enter Y2 :: ");
		int y6 = keyboard.nextInt();
		
		Distance myThirdDistance = new Distance();
		myThirdDistance.setCoordinates(x5, y5, x6, y6);
		myThirdDistance.calcDistance();
		System.out.print("distance == ");
		myThirdDistance.print();
	}
}