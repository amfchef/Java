/**
 * 
 */
package johanssonJakob;
import java.util.Scanner;
/**
 * Write a program that reads a number and displays the square, cube, and fourth
 * power. Use the Math.pow method only for the fourth power.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		double input = scan.nextInt();
		double square = input * input;
		double cube = input * input * input;
		double powerOfFour = Math.pow(input, 4);
		
		System.out.println("The square of this number is: " + square + 
				"\nThe cube of this number is: " + cube + 
				"\nThe forth power of this number is: " + powerOfFour);
		scan.close();
		System.exit(0);
	}

}
