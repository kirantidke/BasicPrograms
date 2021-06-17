package Bridgelabz;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter divident=");
		int divident = s.nextInt();
		
		System.out.print("Enter divisor=");
		int divisor = s.nextInt();
		int quotient = divident / divisor;
		int reminder = divident % divisor;
		
		System.out.println("Quotient is = " +quotient);
		System.out.println("Reminder is = " +reminder);

	}

}
