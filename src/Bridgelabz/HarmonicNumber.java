package Bridgelabz;
import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number = ");
		int number = s.nextInt();
		String harmonicnumber = "1";
		for(int i =2;i<=number;i++) {
			harmonicnumber+= "+(1/"+i+")";
			}
		System.out.print("harmonic numbers="+harmonicnumber);
		}

	}


