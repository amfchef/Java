/**
 * 
 */
package johanssonJakob;
import java.util.Scanner;
/**
 * 
 * Write a program that prompts the user for two integers and then prints
 * <ol>
 * <li> The sum </li>
 * <li> The difference </li>
 * <li> The product </li>
 * <li> The average </li>
 * <li> The distance (absolute value of the difference) </li>
 * <li> The maximum (the larger of the two) </li>
 * <li> The minimum (the smaller of the two) </li>
 * </ol>
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter you second number:");
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multiplication = num1 * num2;
		double average = sum/2;
		int abs = Math.abs(sub);
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		System.out.print("Here is the result: "
				+ "\nSum: " + sum + "\nDifference: " + sub + "\nProduct: " + multiplication + 
				"\nAverage: " + average + "\nDistance [ABS]: " + abs + "\nMax number: " + max + 
				"\nMin number: " + min);
		
		scan.close();
		System.exit(0);
	}

}
