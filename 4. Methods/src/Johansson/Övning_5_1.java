package Johansson;

import java.util.Scanner;

/**
 * 
 * Write a program that initializes an array with ten random integers and then prints
four lines of output, containing
• Every element at an even index.
• Every even element.
• All elements in reverse order.
• Only the first and last element.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_1 {

	public static double minNum(double num1, double num2, double num3) {
		return Math.min(Math.min(num1, num2), num3);

	}

	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three decimal numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		scan.close();
		System.out.printf("The minimum value is %.2f\nThe average value is: %.2f", 
				minNum(num1, num2, num3), average(num1, num2, num3));
		System.exit(0);
	}

}
