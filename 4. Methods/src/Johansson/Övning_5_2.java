package Johansson;

import java.util.Scanner;

/**
 * 
 * Write the following methods and provide a program to test them. a. boolean
 * allTheSame(double x, double y, double z), returning true if the arguments are
 * all the same b. boolean allDifferent(double x, double y, double z), returning
 * true if the arguments are all different c. boolean sorted(double x, double y,
 * double z), returning true if the arguments are sorted, with the smallest one
 * coming first
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_2 {

	public static boolean sameNums(double num1, double num2, double num3) {
		if (num1 == num2 && num2 == num3) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean allDifferentNums(double num1, double num2, double num3) {
		if (num1 != num2 && num2 != num3) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean sortNums(double num1, double num2, double num3) {
		if (num1 < num2 && num2 < num3) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three decimal numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		scan.close();
		System.out.println("The statement if the numbers are the same: " + sameNums(num1, num2, num3)
				+ "\nThe statement if the numbers are all different: " + allDifferentNums(num1, num2, num3)
				+ "\nThe statement if the numbers are all sorted from min to max: " + sortNums(num1, num2, num3));
		System.exit(0);
	}

}