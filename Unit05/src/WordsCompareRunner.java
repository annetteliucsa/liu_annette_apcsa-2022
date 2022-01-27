//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter a word :: ");
	   String myWordOne = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWordTwo = keyboard.nextLine();
	   WordsCompare myWords = new WordsCompare();
	   myWords.setWords(myWordOne, myWordTwo);
	   System.out.println(myWords.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord3 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord4 = keyboard.nextLine();
	   WordsCompare myWords2 = new WordsCompare();
	   myWords2.setWords(myWord3, myWord4);
	   System.out.println(myWords2.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord5 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord6 = keyboard.nextLine();
	   WordsCompare myWords3 = new WordsCompare();
	   myWords3.setWords(myWord5, myWord6);
	   System.out.println(myWords3.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord7 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord8 = keyboard.nextLine();
	   WordsCompare myWords4 = new WordsCompare();
	   myWords4.setWords(myWord7, myWord8);
	   System.out.println(myWords4.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord9 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord10 = keyboard.nextLine();
	   WordsCompare myWords5 = new WordsCompare();
	   myWords5.setWords(myWord9, myWord10);
	   System.out.println(myWords5.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord11 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord12 = keyboard.nextLine();
	   WordsCompare myWords6 = new WordsCompare();
	   myWords6.setWords(myWord11, myWord12);
	   System.out.println(myWords6.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord13 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord14 = keyboard.nextLine();
	   WordsCompare myWords7 = new WordsCompare();
	   myWords7.setWords(myWord13, myWord14);
	   System.out.println(myWords7.toString());
	   
	   System.out.println("Enter a word :: ");
	   String myWord15 = keyboard.nextLine();
	   System.out.println("Enter a word 2 :: ");
	   String myWord16 = keyboard.nextLine();
	   WordsCompare myWords8 = new WordsCompare();
	   myWords8.setWords(myWord15, myWord16);
	   System.out.println(myWords8.toString());
	}
}