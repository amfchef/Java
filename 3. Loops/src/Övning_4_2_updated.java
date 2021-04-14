import java.util.Scanner;

/**
 * 
 * Write programs that read a sequence of integer inputs and print The smallest
 * and largest of the inputs. The number of even and odd inputs. Cumulative
 * totals. For example, if the input is 1 7 2 9, the program should print 1 8 10
 * 19. All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6
 * 2, the program should print 3 5 6.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_2_updated {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int maxNum;
		int minNum;
		int prevNum = 0;
		String evenNums = "";
		String oddNums = "";
		String checkForDublicates = ""; // saving all numbers to check for dublicates
		String dublicates = "";

		System.out.println("Enter a number, if you want to exit, enter exit");
		maxNum = scan.nextInt();
		minNum = maxNum;
		checkForDublicates += maxNum;
		int input = 0;
		while (scan.hasNextInt()) {
			input = scan.nextInt();
			checkForDublicates += input;
			if (input < minNum) {
				minNum = input;
			} else if (input > maxNum) {
				maxNum = input;
			}
			if (input % 2 == 0) {
				evenNums = evenNums + input + " ";
			} else if (input % 2 != 0) {
				oddNums = oddNums + input + " ";
			}
		}
		for (int i = 1; i < checkForDublicates.length(); i++) {

			if (checkForDublicates.charAt(i) == checkForDublicates.charAt(i - 1)) {
				dublicates += checkForDublicates.charAt(i) + " ";
			}
		}
		scan.close();
		System.out.println("\nThe minimum number is: " + minNum + "\nThe maximum number is: " + maxNum);

		System.out.println("The even number are: " + evenNums + "\nThe odd number are: " + oddNums);

		if (checkForDublicates != "") {
			System.out.println("The dublicates from your input were " + dublicates);
		}
		System.exit(0);
	}
}