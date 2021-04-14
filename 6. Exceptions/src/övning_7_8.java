import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that replaces each line of a file with its reverse. For
 * example, if you run java Reverse HelloPrinter.java then the contents of
 * HelloPrinter.java are changed to retnirPolleH ssalc cilbup { )sgra
 * ][gnirtS(niam diov citats cilbup { wodniw elosnoc eht ni gniteerg a yalpsiD
 * // ;)"!dlroW ,olleH"(nltnirp.tuo.metsyS } } Of course, if you run Reverse
 * twice on the same file, you get back the original file.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_8 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\jakob\\Desktop\\HIG Java Workshop\\Kap7_Exceptions\\src\\HelloPrinter.java");

		ArrayList<String> copyToArray = new ArrayList<String>();
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			// Adding each lines to the arrayList
			copyToArray.add(scan.nextLine());
			copyToArray.add("\n");
		}
		scan.close();
		for (int i = 0; i < copyToArray.size(); i++) {
			System.out.print(copyToArray.get(i));
		}

		PrintWriter output = new PrintWriter(
				("C:\\Users\\jakob\\Desktop\\HIG Java Workshop\\Kap7_Exceptions\\src\\HelloPrinter.java"));
		for (int i = 0; i < copyToArray.size(); i++) {
			// cloning and adding the elements to the array
			char[] stringLine = copyToArray.get(i).toCharArray();

			// copy the char to string array in the same file
			for (int j = stringLine.length - 1; j >= 0; j--) {
				// copy index char in file
				output.print(stringLine[j]);
			}
		}
		output.close();
	}
}
/*
public class HelloPrinter {

public static void main(String[] args) {
	System.out.println("Hello World!");

}

}
*/