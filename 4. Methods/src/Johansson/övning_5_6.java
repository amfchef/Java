package Johansson;

import java.util.Scanner;

/**
 * 
 * Write a method public static int countVowels(String str) that returns a count
 * of all vowels in the string str. Vowels are the letters a, e, i, o, and u,
 * and their uppercase variants.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_5_6 {

	public static int countVowels(String input) {
		String vowels = "aouåeiyäö";
		input = input.toLowerCase();
		int count = 0;
		String vowelsFromInput = "";
		for (int i = 0; i < input.length(); i++) {
			// input.charAt(i);
			for (int j = 0; j < vowels.length(); j++) {
				if (input.charAt(i) == vowels.charAt(j)) {
					count++;
					vowelsFromInput += input.charAt(i) + " ";
				}
			}
		}
		System.out.print("The vowels from your input are: " + vowelsFromInput + "\nThe number of vowels are: ");
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a any input, to find out how many vowels:");
		String input = scan.nextLine();
		scan.close();
		System.out.println(countVowels(input));
		System.exit(0);
	}
}