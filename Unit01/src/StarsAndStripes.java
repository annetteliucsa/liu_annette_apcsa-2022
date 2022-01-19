//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   System.out.print("********************");
	   System.out.println("");
   }

   public void printTwentyDashes()
   {
	   System.out.print("--------------------");
	   System.out.println("");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("");
	   System.out.println("");
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   {
	   printASmallBox();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
   }
}