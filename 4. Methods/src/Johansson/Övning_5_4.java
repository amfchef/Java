package Johansson;

import java.util.Scanner;

/**
 * 
 * Write a method public static String middle(String str) that returns a string
 * containing the middle character in str if the length of str is odd, or the
 * two middle characters if the length is even. For example, middle("middle")
 * returns "dd".
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_4 {

	public static String middleNum(String num) {
		int length = num.length();
		int position = 0;

		if (length % 2 == 0) {
			length /= 2;
			return num.substring(length - 1, length + 1);
		} else {
			length /= 2 + 0.5;
			return num.substring(length, length + 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a any input, to find out the middle characters:");
		String input = scan.nextLine();
		scan.close();
		System.out.println("The middle characters from your input is: " + middleNum(input));
		System.exit(0);
	}

}
