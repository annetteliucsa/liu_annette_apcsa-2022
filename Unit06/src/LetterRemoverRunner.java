//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a string: ");
		String sOne  = keyboard.nextLine();
		out.println(" - letter to remove");
		char cOne = keyboard.next().charAt(0);
		LetterRemover stringFinal = new LetterRemover();
		stringFinal.setRemover(sOne, cOne);
		System.out.println(stringFinal.toString());
											
	}
}