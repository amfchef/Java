package Johansson;

import java.util.Scanner;

/**
 * 
 * Write a method public static double readDouble(String prompt) that displays
 * the prompt string, followed by a space, reads a floating-point number in, and
 * returns it. Here is a typical usage: salary = readDouble("Please enter your
 * salary:"); percentageRaise = readDouble("What percentage raise would you
 * like?");
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_10 {

	public static double readDouble(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt + " ");
		// creating a while loop so the user have to enter a floating num
		while (scan.hasNextDouble()) {

			return scan.nextDouble();
		}
		scan.close();
		return readDouble(prompt);

	}

	public static void main(String[] args) {

		double salary = readDouble("Please enter your salary:");
		double raise = readDouble("Please enter how much percentage of raise you would like:");
		System.out.printf("your new salary with the new raise would be %.2f%n", (salary * ((100 + raise) / 100)));
		System.exit(0);
	}

}
