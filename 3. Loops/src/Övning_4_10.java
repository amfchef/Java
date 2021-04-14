import java.util.Scanner;

/**
 * 
 * Skapa ett program som är en version av Math.pow. D.v.s programmet skall ta
 * emot en bas och en exponent och skriva ut vadresultatet blir med hjälp av en
 * loop. Math.pow får inte användas.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to your power of calculator, please enter your base: ");
		int base = scan.nextInt();
		System.out.println("Please enter your exponent: ");
		int exponent = scan.nextInt();
		scan.close();
		int result = 1; // result must start at 1
		for (int count = 0; count < exponent; count++) { // looping the number "exponent" times
			result *= base;
		}
		System.out.println("The result is: " + result);

		System.exit(0);
	}

}
