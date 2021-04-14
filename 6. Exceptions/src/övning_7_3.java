import java.io.File;
import java.io.FileNotFoundException;
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
 * Repeat Exercise P7.2, but allow the user to specify 
 * the file name on the commandline.
 * If the user doesn’t specify any file name, 
 * then prompt the user for the name.
 * 
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_3 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Enter the file name you would like to open: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(args[0]);
		
		File file = new File(args[0]);
		Scanner myReader = new Scanner(file);
		if(args.length != 0) {
			
			System.out.print("The content from " + file + " is\n");
			while (myReader.hasNextLine()) {
		        String output = myReader.nextLine();
		        System.out.println(output);
		      }
		}
		else {
			System.out.println("Please enter the file's name: ");
		}
		
		myReader.close();
		System.exit(0);

	}

}
