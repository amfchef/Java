package johansson;
import java.util.Scanner;
/**
 * Roman numbers. Write a program that converts a positive integer into the Roman
 * number system. The Roman number system has digits
 * <ol>
 * <li>I 1 </li>
 * <li>V 5</li>
 * <li>X 10</li>
 * <li>L 50</li>
 * <li>C 100</li>
 * <li>D 500</li>
 * <li>M 1000</li>
 * </ol>
 * 
 * Numbers are formed according to the following rules:
 * Only numbers up to 3,999 are represented.
 * As in the decimal system, the thousands, hundreds, tens, and ones are
 * expressed separately.
 * The numbers 1 to 9 are expressed as
 * <ol>
 * <li>I 1</li>
 * <li>II 2</li>
 * <li>III 3</li>
 * <li>IV 4</li>
 * <li>V 5</li>
 * <li>VI 6</li>
 * <li>VII 7</li>
 * <li>VIII 8</li>
 * <li>IX 9</li>
 * </ol>
 * As you can see, an I preceding a V or X is subtracted from the value, and you
 * can never have more than three I’s in a row.
 * Tens and hundreds are done the same way, except that the letters X, L, C and C,
 * D, M are used instead of I, V, X, respectively.
 * Your program should take an input, such as 1978, and convert it to Roman numerals,
 * MCMLXXVIII.
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */

public class övning_3_26_withMethods {

	public static int romanLetters(int rest, int romanNum) {
		int quantities = rest/romanNum;		//see how many times a roman number can divide with the year
		return quantities;
	}
	public static int restYears (int rest, int romanNum) {
		int theRest = rest % romanNum;	//calculating the rest and returning it
		return theRest;
	}
	public static void printRomanNum (String romanNumber, int quant) {
		while (quant > 0) {		//printing out the roman number 
			System.out.print(" " + romanNumber + " ");
			quant--;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = scan.nextInt();
		int rest = year;
		int quant = 0;
		
		//giving each roman number a value
		int M = 1000;
		int D = 500;
		int C = 100;
		int L = 50;
		int X = 10;
		int I = 1;
		int II = 2;
		int III = 3;
		int IV = 4;
		int V = 5;
		int VI = 6;
		int VII = 7;
		int VIII = 8;
		int IX = 9;
		
		//Calling their method with their specific value of roman nums. see how many times you can divide the year/rest with the roman value
		quant = romanLetters(rest, M);
		rest = restYears(rest, M);
		printRomanNum("M", quant) ;
		quant = 0;
			
		quant = romanLetters(rest, D);
		rest = restYears(rest, D);
		printRomanNum("D", quant);
		quant = 0;
			
		quant = romanLetters(rest, C);
		rest = restYears(rest, C);
		printRomanNum("C", quant);
		quant = 0;
			
		quant = romanLetters(rest, L);
		rest = restYears(rest, L);
		printRomanNum("L", quant);
		quant = 0;
			
		quant = romanLetters(rest, X);
		rest = restYears(rest, X);
		printRomanNum("X", quant);
		quant = 0;
			
		quant = romanLetters(rest, IX);
		rest = restYears(rest, IX);
			printRomanNum("IX", quant);
			quant = 0;
			
			quant = romanLetters(rest, VIII);
			rest = restYears(rest, VIII);
			printRomanNum("VIII", quant);
			quant = 0;
			
			quant = romanLetters(rest, VII);
			rest = restYears(rest, VII);
			printRomanNum("VII", quant);
			quant = 0;
			
			quant = romanLetters(rest, VI);
			rest = restYears(rest, VI);
			printRomanNum("VI", quant);
			quant = 0;
			
			quant = romanLetters(rest, V);
			rest = restYears(rest, V);
			printRomanNum("V", quant);
			quant = 0;
			
			quant = romanLetters(rest, IV);
			rest = restYears(rest, IV);
			printRomanNum("IV", quant);
			quant = 0;
			
			quant = romanLetters(rest, III);
			rest = restYears(rest, III);
			printRomanNum("III", quant);
			quant = 0;
			
			quant = romanLetters(rest, II);
			rest = restYears(rest, II);
			printRomanNum("II", quant);
			quant = 0;
			
			quant = romanLetters(rest, I);
			rest = restYears(rest, I);
			printRomanNum("I", quant);
			quant = 0;
			
		scan.close();
		System.exit(0);
	}
}
