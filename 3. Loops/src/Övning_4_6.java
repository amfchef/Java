import java.util.Scanner;

/**
 * 
 * Translate the following pseudocode for finding the minimum value from a set
 * of inputs into a Java program. Set a Boolean variable "first" to true. While
 * another value has been read successfully If first is true Set the minimum to
 * the value. Set first to false. Else if the value is less than the minimum Set
 * the minimum to the value. Print the minimum.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean first = true;
		int input = 0;
		int minimum = 0;
		System.out.println("Enter an input: ");
		while (scan.hasNextInt()) {
			input = scan.nextInt();
			if (first == true) {
				minimum = input;
				first = false;
			} else if (input < minimum) {
				minimum = input;

			}
		}
		scan.close();
		System.out.println(minimum);

		System.exit(0);
	}

}
