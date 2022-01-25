//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Discount myBill = new Discount();
		System.out.println("Bill after discount :: ");
		System.out.printf("%.2f", myBill.getDiscountedBill(amt));
		
		out.println("\nEnter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		Discount myBill1 = new Discount();
		System.out.println("Bill after discount :: ");
		System.out.printf("%.2f", myBill1.getDiscountedBill(amt1));
		
		out.println("\nEnter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		Discount myBill2 = new Discount();
		System.out.println("Bill after discount :: ");
		System.out.printf("%.2f", myBill2.getDiscountedBill(amt2));
		
		out.println("\nEnter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		Discount myBill3 = new Discount();
		System.out.println("Bill after discount :: ");
		System.out.printf("%.2f", myBill3.getDiscountedBill(amt3));
		
		out.println("\nEnter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		Discount myBill4 = new Discount();
		System.out.println("Bill after discount :: ");
		System.out.printf("%.2f", myBill4.getDiscountedBill(amt4));

	}
}