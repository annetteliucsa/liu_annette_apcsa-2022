//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		
		out.println("Enter a whole number :: ");
		int num = keyboard.nextInt();
		System.out.print(num);
		System.out.println(" is odd :: " + NumberVerify.isOdd(num));
		System.out.print(num);
		System.out.print(" is even :: " + NumberVerify.isEven(num));
		
		out.println("\nEnter a whole number :: ");
		int num1 = keyboard.nextInt();
		System.out.print(num1);
		System.out.println(" is odd :: " + NumberVerify.isOdd(num1));
		System.out.print(num1);
		System.out.print(" is even :: " + NumberVerify.isEven(num1));
		
		out.println("\nEnter a whole number :: ");
		int num2 = keyboard.nextInt();
		System.out.print(num2);
		System.out.println(" is odd :: " + NumberVerify.isOdd(num2));
		System.out.print(num2);
		System.out.print(" is even :: " + NumberVerify.isEven(num2));
		
		out.println("\nEnter a whole number :: ");
		int num3 = keyboard.nextInt();
		System.out.print(num3);
		System.out.println(" is odd :: " + NumberVerify.isOdd(num3));
		System.out.print(num3);
		System.out.print(" is even :: " + NumberVerify.isEven(num3));

		out.println("\nEnter a whole number :: ");
		int num4 = keyboard.nextInt();
		System.out.print(num4);
		System.out.println(" is odd :: " + NumberVerify.isOdd(num4));
		System.out.print(num4);
		System.out.print(" is even :: " + NumberVerify.isEven(num4));
	}
}