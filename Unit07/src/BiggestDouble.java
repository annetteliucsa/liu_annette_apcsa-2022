//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double max = 0;
		double doubleArray[] = {one, two, three, four};
		for(int i = 0; i < doubleArray.length; i++ ) {
			if(doubleArray[i] > max) {
				max = doubleArray[i];
			}
		}
		return max;
	}

	public String toString()
	{
	   setDoubles(one, two, three, four);
	   return "biggest = " + getBiggest();
	}
}