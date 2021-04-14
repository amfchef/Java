package johanssonJakob;
import java.util.Scanner;
/**
 * 
 * Write a program that reads a number between 1,000 and 999,999 from the user,
 * where the user enters a comma in the input. Then print the number without a
 * comma. Here is a sample dialog; the user input is in color:
 * Please enter an integer between 1,000 and 999,999: 23,456, 23456
 * Hint: Read the input as a string. Measure the length of the string. Suppose it contains
 * n characters. Then extract substrings consisting of the first n – 4 characters and the
 * last three characters.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_2_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1,000 and 999,999: ");
		String input = scan.next();
		int lengthOfInput = input.length();				//calculate amount of characters
		String firstZeros = input.substring(0, lengthOfInput - 4);
		String secondZeros = input.substring(lengthOfInput - 3, lengthOfInput);
		String result = firstZeros + secondZeros;
		System.out.println("Your number whithout the commas are: " + result);
		
		scan.close();
		System.exit(0);
	}

}
