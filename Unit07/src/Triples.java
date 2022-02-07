//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd =1;
		for(int i = 2; i<a; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public String toString()
	{
		for(int a = 1; a <= number; a++) {
			for(int b = a; b<= number; b++) {
				for(int c = b; c<= number; c++) {
					if((a*a + b*b == c*c) && (c<number) && (greatestCommonFactor(a,b,c)<2)) {
						out.println(a + " " + b + " "+ c);
					}
				}
			}
		}
		return "";
	}
}