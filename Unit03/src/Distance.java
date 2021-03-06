//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		double xValue = Math.pow(xTwo - xOne, 2);
		double yValue = Math.pow(yTwo - yOne, 2);
		double xPlusY = xValue + yValue;
		distance = Math.sqrt(xPlusY);
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		out.printf("%.3f\n", distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		String str = String.valueOf(distance);
		return str;
	}
}