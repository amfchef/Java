package Johansson;

import java.util.Scanner;

/**
 * 
 * Write the following methods. a. int firstDigit(int n), returning the first
 * digit of the argument b. int lastDigit(int n), returning the last digit of
 * the argument c. int digits(int n), returning the number of digits of the
 * argument For example, firstDigit(1729) is 1, lastDigit(1729) is 9, and
 * digits(1729) is 4. Provide a program that tests your methods.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_3 {

	public static int firstDigit(int n) {
		// String numberString = Integer.toString(n);
		int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
		return firstDigit;
	}
	public static int lastDigit(int n) {
		int digitsN = n % 10;
		return digitsN;
	}
	public static int numberOfDigits(int n) {
		String s = Integer.toString(n);
		int i = s.length();
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		scan.close();
		System.out.println("The first digit is: " + firstDigit(num) + "\nThe last digit is: " + lastDigit(num)
				+ "\nThe number os digits are:" + numberOfDigits(num));
		System.exit(0);
	}
}
