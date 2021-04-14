
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

/**
 * Write a program that asks the user for a file name and prints the number of
 * characters, words, and lines in that file.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_5 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the file name: ");
		Scanner scan = new Scanner(System.in);

		File file = new File("readinFile.txt");
		String input = scan.nextLine();
		if (input.equals("readinFile.txt")) {

		int countWord = 0;
		int characterCount = 0;
		
		LineNumberReader reader = null;
		reader = new LineNumberReader(new FileReader(new File("readinFile.txt")));
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader fileName = new InputStreamReader(fileStream);
		BufferedReader newReader = new BufferedReader(fileName);
		String line;
		while ((line = newReader.readLine()) != null) {

			characterCount += line.length();
			// calculate how many words, \\s means whiteSpace, saving the value to an array
			String[] wordList = line.split("\\s+");
			//calculate how many words with the method length
			countWord += wordList.length;
			
		}
		newReader.close();
		while ((reader.readLine()) != null)
		{	
			reader.getLineNumber();
		}
		System.out.println("Please see the details of file " + file.getName() + ":");
		System.out.println("Total word: " + countWord);
		System.out.println("Total number of characters: " + characterCount);
		System.out.println("Total numbers of lines " + reader.getLineNumber());

		reader.close();
		}
		 else {
			System.out.println("Error\nThe file wasn't found");
		}

		System.exit(0);
	}

}
