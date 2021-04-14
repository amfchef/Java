import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Using the mechanism described in Special Topic 7.1, write a program that reads all
 * data from a web page and writes them to a file. Prompt the user for the web page
 * URL and the file.
 * Spara filen med den nedladdade koden som en .html fil så att du sedan kan testa 
 * att öppna den i en webbläsare.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_7_14 {

	public static void main(String[] args) throws IOException {
		try {
		System.out.println("Enter a file with name: ");
		Scanner scan = new Scanner(System.in);
		String inputFileName = scan.nextLine();
		System.out.println("Enter an URL: ");
		String inputFilePage = scan.nextLine();
		
		URL pageLocation = new URL(inputFileName); 
		scan.close();
		URLConnection con = pageLocation.openConnection();
		Scanner in = new Scanner(pageLocation.openStream());
		InputStream is = con.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line = null;
		PrintWriter pw = new PrintWriter(inputFileName);
		while ((line = br.readLine()) != null){
			pw.println(line);
		}
		pw.close();
		System.exit(0);
		}
		catch(Exception e) {
			System.err.println("Error \nInvalid input");
		}
	}

}
