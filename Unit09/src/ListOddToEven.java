//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray)
	{
		boolean x = false;
		int distance = 0;
		int noNumbers = -1;
		for(int i = 0; i < ray.size(); i++) {
			if(ray.get(i) % 2 != 0 && !x) {
				x = true;
			}
			else if(x && ray.get(i) % 2 != 0) {
				distance = distance + 1;
			}
			else if (x && ray.get(i) % 2 == 0) {
				distance = distance + 1;
				if(distance > noNumbers) {
					noNumbers = distance;
				}
			}
		}
		return noNumbers;
	}
}