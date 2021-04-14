import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that reads a file containing two columns of floating-point
 * numbers. Prompt the user for the file name. Print the average of each column.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_4 {

	public static void main(String[] args) throws IOException {

		System.out.println("Please enter the file name: ");
		Scanner scan = new Scanner(System.in);
		File file = new File("2columsFloat.txt");
		String input = scan.nextLine();
		Scanner myReader = new Scanner(file);

		PrintWriter writer = new PrintWriter(file);
		if (input.equalsIgnoreCase("2columsFloat.txt")) {
			double num1 = 0;
			double num2 = 0;
			double sum1 = 0;
			double sum2 = 0;
			int count = 0;
			for (int i = 1; i < 5; i++) {
				num1 += i * 1.5;
				num2 += i * 1.25;
				sum1 = +num1;
				sum2 = +num2;
				count++;
				writer.printf("%1.2f\t\t", num1);
				writer.printf("%1.2f\n", num2);
			}
			System.out.println("The average from the first column is: " + num1 / count);
			System.out.println("The average from the second column is: " + num2 / count);
		} else {
			System.out.println("Error\n The file wasn't found");
		}
		myReader.close();
		writer.close();
		System.exit(0);
	}
}
