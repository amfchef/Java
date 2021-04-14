import java.util.Scanner;

/**
 * 
 * Write a program that reads a number and prints all of its binary digits:
 * Print the remainder number % 2, then replace the number with number / 2. Keep
 * going until the number is 0. For example, if the user provides the input 13,
 * the output should be 1 0 1 1
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		scan.close();
		int remain = num;

		while (num != 0) {
			remain = num % 2;

			System.out.println(remain + " ");
			num = num / 2;
		}
		System.out.println(num + " " + remain);

		System.exit(0);
	}

}
