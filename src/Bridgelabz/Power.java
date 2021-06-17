package Bridgelabz;
import java.util.Scanner;
public class Power {
	void powercal(int n) {
		int i = 0;
		int powercal = 1;
		while(i<=n) {
			//repeat until i = n
			System.out.println("2"+"^"+i+"="+powercal);//prints the power of two
			powercal = 2 * powercal;
			i = i+1;
		}
		
	}

	public static void main(String[] args) {
		Power p = new Power(); 
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number=");
		p.powercal(s.nextInt());
	}
	
}
