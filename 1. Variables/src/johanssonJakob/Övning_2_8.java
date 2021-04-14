package johanssonJakob;
import java.util.Scanner;

/**
 * 
 * Write a program that asks the user for the lengths of the sides of a rectangle. Then
 *print
 * <ol>
 * <li> The area and perimeter of the rectangle </li>
 * <li> The length of the diagonal (use the Pythagorean theorem) </li>
 * </ol>
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_2_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length [cm] of one sides in a rectangle: ");
		double side1 = scan.nextDouble();
		System.out.println("Enter the length [cm] of the second sides in a rectangle: ");
		double side2 = scan.nextDouble();
		scan.close();
		double area = side1 * side2;
		double diagonal = Math.pow((Math.pow(side1, 2) + Math.pow(side2, 2)), 0.5);
		System.out.printf("Here is the result: \nArea %.2f cm^2 \nDiagonal %.2f cm ", area, diagonal);
		System.exit(0);
	}

}
