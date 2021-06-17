package Bridgelabz;
import java.util.Random;
class Coin 
{
	 public static void main(String[] args) {
		int count = 1;
		double result;
		while( count<2 ) {
			result = Math.random();
			if (result <= .5) {
				System.out.println("Heads");
			}
			else
				System.out.println("Tails");
			count = count+1;
			}
	 }
}
