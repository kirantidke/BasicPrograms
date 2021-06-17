package Bridgelabz;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter number1 = ");
		int number1 = s.nextInt();
		
		System.out.print("enter number2 = ");
		int number2 = s.nextInt();
	
		System.out.print("enter number3 = ");
		int number3 = s.nextInt();
		if((number1 > number2) &&(number1>number3)) {
			System.out.println("first number "+number1+ " is largest=");
		}
		else
			
			if((number2 > number1) && (number2 > number3)) {
				System.out.println("second number "+number2+" is largest");
			}
			else
				System.out.println("third number "+number3+" is largest ");
	
	
	}

}
