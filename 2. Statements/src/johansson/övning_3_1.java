/**
 * 
 */
package johansson;
import java.util.Scanner;
/**
 * 
 * Write a program that reads an integer and prints whether it is negative, zero, or
 * positive.
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		scan.close();
		if (input == 0) {
			System.out.println("Number is 0");
		}
		else if (input > 0) {
			System.out.println("Number bigger than 0 [positive]");
		}
		else
		{
			System.out.println("Number less than 0 [negative]");
		}
		System.out.print("The number was " + input);
		System.exit(0);

	}

}
