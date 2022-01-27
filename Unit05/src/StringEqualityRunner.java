//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		String wordOne = keyboard.nextLine();
		String wordTwo = keyboard.nextLine();
		StringEquality newWord = new StringEquality();
		newWord.setWords(wordOne, wordTwo);
		System.out.println(newWord.toString());
		
		String wordThree = keyboard.nextLine();
		String wordFour = keyboard.nextLine();
		StringEquality newWord2 = new StringEquality();
		newWord2.setWords(wordThree, wordFour);
		System.out.println(newWord2.toString());
		
		String wordFive = keyboard.nextLine();
		String wordSix = keyboard.nextLine();
		StringEquality newWord3 = new StringEquality();
		newWord3.setWords(wordFive, wordSix);
		System.out.println(newWord3.toString());
		
		String wordSeven = keyboard.nextLine();
		String wordEight = keyboard.nextLine();
		StringEquality newWord4 = new StringEquality();
		newWord4.setWords(wordSeven, wordEight);
		System.out.println(newWord4.toString());
		
		String wordNine = keyboard.nextLine();
		String wordTen = keyboard.nextLine();
		StringEquality newWord5 = new StringEquality();
		newWord5.setWords(wordNine, wordTen);
		System.out.println(newWord5.toString());
		
		String wordEleven = keyboard.nextLine();
		String wordTwelve = keyboard.nextLine();
		StringEquality newWord6 = new StringEquality();
		newWord6.setWords(wordEleven, wordTwelve);
		System.out.println(newWord6.toString());
		
		String wordThirteen = keyboard.nextLine();
		String wordFourteen = keyboard.nextLine();
		StringEquality newWord7 = new StringEquality();
		newWord7.setWords(wordThirteen, wordFourteen);
		System.out.println(newWord7.toString());
		
		String wordFifteen = keyboard.nextLine();
		String wordSixteen = keyboard.nextLine();
		StringEquality newWord8 = new StringEquality();
		newWord8.setWords(wordFifteen, wordSixteen);
		System.out.println(newWord8.toString());
	}
}