/**
 * Vu Pham 
 * CSC 501
 * Assignment #4
 * Project 1: Phone Keypads
 */

import java.util.*;

public class Exercise04_15 {
	public static void main(String[] args) {

		// prompt for input value
		System.out.print("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		
		String letter = input.nextLine().toUpperCase(); // convert to upper case
		char r = letter.charAt(0); // convert string to char
		int digit = -1; //set exit value

		// set the digit value based on the letter
		if (r == 'A' || r == 'B' || r == 'c')
			digit = 2;
		else if (r == 'D' || r == 'E' || r == 'F')
			digit = 3;
		else if (r == 'G' || r == 'H' || r == 'I')
			digit = 4;
		else if (r == 'J' || r == 'K' || r == 'L')
			digit = 5;
		else if (r == 'M' || r == 'N' || r == 'O')
			digit = 6;
		else if (r == 'P' || r == 'Q' || r == 'R' || r == 'S')
			digit = 7;
		else if (r == 'T' || r == 'U' || r == 'V')
			digit = 8;
		else if (r == 'W' || r == 'X' || r == 'Y' || r == 'Z')
			digit = 9;
		
		// display the outputs
		if (digit != -1)
			System.out.println("The corresponding digit of letter '" + r + "' is: " + digit);
		else
			System.out.println("You have entered invalid character ");

	}
}