package Johansson;

import java.util.Scanner;

/**
 * 
 * Skriv en metod som tar emot en textsträng och som returnerar samma sträng
 * fast med stor bokstav på varje ord. Eventuella extra mellanslag (utöver ett
 * mellan varje ord) före, i, eller i slutet av texten skall tas bort.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_extra1 {

	public static String capitalizeFirstLetterInText(String input) {
		input = input.toLowerCase();
		boolean firstLetterOfWord = false;
		char[] findFirstLetter = input.toLowerCase().toCharArray();
		// looping all letters from the char array
		for (int i = 0; i < findFirstLetter.length; i++) {
			// this if statement will catch every first letters in a word to convert to
			// capital letters
			if (!firstLetterOfWord && Character.isLetter(findFirstLetter[i])) {
				findFirstLetter[i] = Character.toUpperCase(findFirstLetter[i]);
				firstLetterOfWord = true; // chaning the boolean to true, so it doesnt loop back to the same if
											// statement
			}
			// this else if will catch every letters in a word that is not the first, and
			// just leave it as it is.
			else if (Character.isWhitespace(findFirstLetter[i])) {
				firstLetterOfWord = false;
			}
		} // converting and returning the char to string
		return String.valueOf(findFirstLetter);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Please enter a text, and the programe will convert all first letters in a the words to capital letter:");
		String input = scan.nextLine();
		scan.close();
		System.out.println(
				"The text will be converted like this if you swap the first letter in a word to capital letter: \n"
						+ capitalizeFirstLetterInText(input));
		System.exit(0);
	}
}