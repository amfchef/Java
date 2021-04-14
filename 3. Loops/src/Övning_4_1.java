import java.util.Scanner;

/**
 * 
 * Write programs with loops that compute The sum of all even numbers between 2
 * and 100 (inclusive). The sum of all odd numbers between a and b (inclusive),
 * where a and b are inputs.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sumEvenNums = 0;
		for (int i = 2; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				sumEvenNums = sumEvenNums + i;

			}
		}
		System.out.println("The sum of all even numbers from 0 and 100 is: " + sumEvenNums);

		int sumOddNums = 0;
		System.out.println("Enter your first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = scan.nextInt();

		for (int i = num1; i < num2; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
				sumOddNums = sumOddNums + i;

			}
		}
		System.out.println("The sum of all odd numbers from your first input to your second number is: " + sumEvenNums);
		System.exit(0);
	}

}
