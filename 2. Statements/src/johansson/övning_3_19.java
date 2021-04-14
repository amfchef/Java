package johansson;
import java.util.Scanner;
/**
 * Write a program that reads in two floating-point numbers and tests whether they are
 * the same up to two decimal places. Here are two sample runs.
 * Enter two floating-point numbers: 2.0 1.99998
 * They are the same up to two decimal places.
 * Enter two floating-point numbers: 2.0 1.98999
 * They are different.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1, with decimals: ");
		double num1 = scan.nextDouble();
		num1 = Math.round(num1 * 100) / 100;
		System.out.println("Enter number 2, with decimals: ");
		double num2 = scan.nextDouble();
		num2 = Math.round(num2 * 100) / 100;
		
		if (num1 < num2) {
			System.out.println("Number " + num2 + " is bigger than " + num1);
		}
		else if (num1 == num2) {
			System.out.println("Number " + num2 + " is equal to " + num1);
		}
		else {
			System.out.println("Number " + num1 + " is bigger than " + num2);
		}
		scan.close();
		System.exit(0);
	}

}
