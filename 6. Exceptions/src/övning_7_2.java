
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that reads a file containing text. Read each line and send it
 * to the output file, preceded by line numbers. If the input file is: 
 * Mary had a little lamb 
 * Whose fleece was white as snow. 
 * And everywhere that Mary went,
 * The lamb was sure to go! then the program produces the output file Mary had a
 * little lamb Whose fleece was white as snow. And everywhere that Mary went,
 * The lamb was sure to go! 
 * 
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_2 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("Mary.txt");
		Scanner myReader = new Scanner(file);
		System.out.print("The content from " + file + " is\n");
		while (myReader.hasNextLine()) {
	        String output = myReader.nextLine();
	        System.out.println(output);
	      }
		myReader.close();
		System.exit(0);
	}

}
