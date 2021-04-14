package Johansson;

import java.util.Scanner;

/**
 * 
 * Write a method public static int countWords(String str) that returns a count
 * of all words in the string str. Words are separated by spaces. For example,
 * countWords(" Mary had a little lamb") should return 5.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_7 {

	public static int countWords(String input) {
		int countWords = 0;
		input = input.trim();

		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				countWords++;
			}
		}
		return countWords + 1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a any input, to find out how many words:");
		String input = scan.nextLine();
		scan.close();
		input = input.trim();
		System.out.println("The quanities of words in your inpus it: " + countWords(input));
		System.exit(0);

	}

}
