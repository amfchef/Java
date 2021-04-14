import java.util.Scanner;

/**
 * 
 * Write a program that reads a word and prints the word in reverse. For
 * example, if the user provides the input "Harry", the program prints yrraH
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String input = scan.nextLine();
		String reversedInput = ""; // creating a String to read the input backwards

		for (int i = input.length() - 1; i >= 0; i--) { // looping the input backwards and saving the letters in a new
														// string
			reversedInput = reversedInput + input.charAt(i);
		}
		System.out.println("The input " + input + " backwards would be " + reversedInput);
		scan.close();
		System.exit(0);
	}

}
