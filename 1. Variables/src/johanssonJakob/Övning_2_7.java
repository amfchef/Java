package johanssonJakob;
import java.util.Scanner;
/**
 * 
 * Write a program that prompts the user for a radius and then prints
 * <ol>
 * <li> The area and circumference of a circle with that radius </li>
 * <li> The volume and surface area of a sphere with that radius </li>
 * </ol>
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_2_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of in cm: ");
		double radius = scan.nextDouble();
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = Math.pow(radius, 3) * Math.PI;
		System.out.printf("The measurement: \nArea: %.2f cm^2 \nVolume: %.2f cm^3", area, volume);
		scan.close();
		System.exit(0);
	}
}
