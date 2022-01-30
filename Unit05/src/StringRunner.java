//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string :: ");
		String word = keyboard.nextLine();
		StringOddOrEven myWord = new StringOddOrEven(word);
		boolean myBoolean = myWord.isEven();
		if(myBoolean == true) {
			System.out.print(word + " is even.");
		}
		else System.out.print(word + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String wordOne = keyboard.nextLine();
		StringOddOrEven myWord1 = new StringOddOrEven(wordOne);
		boolean myBooleanOne = myWord1.isEven();
		if(myBooleanOne == true) {
			System.out.print(wordOne + " is even.");
		}
		else System.out.print(wordOne + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String word2 = keyboard.nextLine();
		StringOddOrEven myWord2 = new StringOddOrEven(word2);
		boolean myBoolean2 = myWord2.isEven();
		if(myBoolean2 == true) {
			System.out.print(word2 + " is even.");
		}
		else System.out.print(word2 + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String word3 = keyboard.nextLine();
		StringOddOrEven myWord3 = new StringOddOrEven(word3);
		boolean myBoolean3 = myWord3.isEven();
		if(myBoolean3 == true) {
			System.out.print(word3 + " is even.");
		}
		else System.out.print(word3 + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String word4 = keyboard.nextLine();
		StringOddOrEven myWord4 = new StringOddOrEven(word4);
		boolean myBoolean4 = myWord4.isEven();
		if(myBoolean4 == true) {
			System.out.print(word4 + " is even.");
		}
		else System.out.print(word4 + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String word5 = keyboard.nextLine();
		StringOddOrEven myWord5 = new StringOddOrEven(word5);
		boolean myBoolean5 = myWord5.isEven();
		if(myBoolean5 == true) {
			System.out.print(word5 + " is even.");
		}
		else System.out.print(word5 + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String word6 = keyboard.nextLine();
		StringOddOrEven myWord6 = new StringOddOrEven(word6);
		boolean myBoolean6 = myWord.isEven();
		if(myBoolean6 == true) {
			System.out.print(word6 + " is even.");
		}
		else System.out.print(word6 + " is odd.");
		
		System.out.println("\nEnter a string :: ");
		String word7 = keyboard.nextLine();
		StringOddOrEven myWord7 = new StringOddOrEven(word7);
		boolean myBoolean7 = myWord7.isEven();
		if(myBoolean7 == true) {
			System.out.print(word7 + " is even.");
		}
		else System.out.print(word7 + " is odd.");
	}
}