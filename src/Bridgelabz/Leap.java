package Bridgelabz;
import java.util.Scanner;
public class Leap {
        
	public static void main(String[] args) {
		int year;
		System.out.println("enter year");
		try(Scanner s = new Scanner(System.in))
		{
			year = s.nextInt();
		}
        if (((year % 4 == 0) &&(year % 100!= 0)) || (year % 400 ==0))
        	System.out.println("year is leap");
        else
        	System.out.println("year is not leap");

	}
}
