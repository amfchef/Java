import java.util.Scanner;

/**
 * 
 * Write programs that read a line of input as a string and print a. Only the
 * uppercase letters in the string. b. Every second letter of the string. c. The
 * string, with all vowels replaced by an underscore. d. The number of vowels in
 * the string. e. The positions of all vowels in the string.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an input: ");
		String input = scan.nextLine();
		scan.close();
		int uppercases = 0;
		System.out.println("The uppercases in your input are the following: ");
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				System.out.print(input.charAt(i) + " ");
				uppercases++;
			}
		}
		System.out.println("\nEvery second letter: ");
		for (int n = 0; n < input.length(); n++) {
			if (n % 2 == 0) {
				System.out.print(input.charAt(n) + " ");
			}
		}
		int vowels = 0;
		input.toLowerCase();

		System.out.println("\nIf you replace every vowels with an underscoll it will look like this:");
		for (int n = 0; n < input.length(); n++) {

			if (input.charAt(n) == 'a' || input.charAt(n) == 'e' || input.charAt(n) == 'i' || input.charAt(n) == 'o'
					|| input.charAt(n) == 'u' || input.charAt(n) == 'y' || input.charAt(n) == 'å'
					|| input.charAt(n) == 'ä' || input.charAt(n) == 'ö') {
				System.out.print("_" + " ");
				vowels++;
			} else {
				System.out.print(input.charAt(n) + " ");
			}
		}
		System.out.println("\nYou have " + vowels + " vowels in your input");

		System.out.println("The position of your vowels in your input from starting point [0] are the following:");
		for (int n = 0; n < input.length(); n++) {

			if (input.charAt(n) == 'a' || input.charAt(n) == 'e' || input.charAt(n) == 'i' || input.charAt(n) == 'o'
					|| input.charAt(n) == 'u' || input.charAt(n) == 'y' || input.charAt(n) == 'å'
					|| input.charAt(n) == 'ä' || input.charAt(n) == 'ö') {
				System.out.println("The vowel " + input.charAt(n) + " is at the position of " + n + " ");
				vowels++;
			}

		}
		System.exit(0);
	}

}
