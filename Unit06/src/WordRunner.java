//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner( System.in);
		out.println("Enter a word: ");
		String wordEntered = keyboard.nextLine();
		Word test = new Word();
		test.setString(wordEntered);
		test.toString();
		System.out.print(test.toString());
		
		out.println("\nEnter a word: ");
		String wordEntered2 = keyboard.nextLine();
		Word test2 = new Word();
		test2.setString(wordEntered2);
		test2.toString();
		System.out.print(test2.toString());
		
		out.println("\nEnter a word: ");
		String wordEntered3 = keyboard.nextLine();
		Word test3 = new Word();
		test3.setString(wordEntered3);
		test3.toString();
		System.out.print(test3.toString());
		
		out.println("\nEnter a word: ");
		String wordEntered4 = keyboard.nextLine();
		Word test4 = new Word();
		test4.setString(wordEntered4);
		test4.toString();
		System.out.print(test4.toString());
		
		out.println("\nEnter a word: ");
		String wordEntered5 = keyboard.nextLine();
		Word test5 = new Word();
		test5.setString(wordEntered5);
		test5.toString();
		System.out.print(test5.toString());
	}
}