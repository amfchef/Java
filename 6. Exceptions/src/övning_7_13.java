import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that asks the user to input a set of floating-point values.
 * When the user enters a value that is not a number, give the user a second
 * chance to enter the value. After two chances, quit reading input. Add all
 * correctly specified values and print the sum when the user is done entering
 * data. Use exception handling to detect improper inputs.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int count = 0;

		System.out.println("Please enter numbers: ");
		while (count < 2) {
			try {
				sum = sum + scan.nextDouble();

			}
			catch (InputMismatchException exception) {
				if (count < 1)
					System.out.println("Input Error\nYou have one last chance left: ");
				{
					String reset = scan.next();
					count++;
				}
			}
		}
		System.out.println("The total sum is: " + sum);
	}
}