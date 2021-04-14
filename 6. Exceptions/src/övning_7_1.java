import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class övning_7_1 {

/**
 * 
 * Write a program that initializes an array with ten random integers and then
 * prints four lines of output, containing Every element at an even index. Every
 * even element. All elements in reverse order. Only the first and last element.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 * @throws FileNotFoundException 
 */
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);
		System.out.print("Enter file name");
		Scanner filNamn = new Scanner(System.in);
		String namn = filNamn.next();
		filNamn.close();
		PrintWriter skrivFil = null;
		
		try {
			skrivFil = new PrintWriter(namn);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		skrivFil.print("Heejsan");
		
		
	
		
		

		
		System.exit(0);
	}

}
