import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * Write a program that carries out the following tasks:
 * 	Open a file with the name hello.txt.
 * 	Store the message “Hello, World!” in the file.
 * 	Close the file.
 * 	Open the same file again.
 * 	Read the message into a string variable and print it.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 * @throws FileNotFoundException 
 */
public class övning_7_1_updated {

	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		PrintWriter write = new PrintWriter(file); //write output to a file
		write.print("Hello, World");
		write.close();
		Scanner scan = new Scanner(file);
		String returnValue = scan.nextLine();
		System.out.print("The content of the file " + file + " is " + returnValue);
		scan.close();
		System.exit(0);

	}

}
