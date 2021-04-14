package johanssonJakob;
import java.util.Scanner;
/**
 * 
 * Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
 * <ol>
 * <li> The sum: 45 </li>
 * <li> The difference: -5 </li>
 * <li> The product: 500 </li>
 * <li> The average 22.5 </li>
 * <li> The distance 5</li>
 * <li> The maximum 25 </li>
 * <li> The minimum 20 </li>
 * </ol>
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_2_5 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 25;
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multiplication = num1 * num2;
		double average = sum / 2.0;
		int abs = Math.abs(sub);
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		System.out.printf("Here is the result: \nSum: %d  \nDifference: %d \nProduct: %d \nAverage: %.1f\n" +
						"Distance [ABS]: %n \nMax number: %d \nMin number: %d\n", 
						min, sum, sub, multiplication, average, abs, max, min);
		System.exit(0);
	}

}
