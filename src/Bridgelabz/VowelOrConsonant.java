package Bridgelabz;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		int i = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character = ");
		char ch = s.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': i++;
		}
		if(i==1) {
			System.out.println("Character"+ch+"is Vowel");
		}
		else
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				System.out.println("Character  "+ch+" is consonent");
			}
			else
				System.out.println("Not alphabet");
	}

}
