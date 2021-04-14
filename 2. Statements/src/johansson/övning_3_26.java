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

public class övning_3_26 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = scan.nextInt();
			
		//giving each roman number a value
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;
		
		int I = 1;
		int II = 2;
		int III = 3;
		int IV = 4;
		int V = 5;
		int VI = 6;
		int VII = 7;
		int VIII = 8;
		int IX = 9;
		
		//here we calculate how many of each roman number we can divide the year from
		//the "q" stands for quantities of "D"s and "M"s
		//rest stands for the remaining years
		int rest = year % M;
		int qM = year/M;
		
		int qD = rest/D;
		rest = rest % D;
		
		rest = rest % C;
		int qC = rest/C;
		
		int qL = rest/L;
		rest = rest % L;
		
		int qX = rest/X;
		rest = rest % X;
		
		int qIX = rest/IX;
		rest = rest % IX;
		 
		int qVIII = rest/VIII;
		rest = rest % VIII;
		
		int qVII = rest/VII;
		rest = rest % VII;
		
		int qVI = rest/VI;
		rest = rest % VI;
		
		int qV = rest/V;
		rest = rest % V;
		
		int qIV = rest/IV;
		rest = rest % IV;
		
		int qIII = rest/III;
		rest = rest % III;
		
		int qII = rest/II;
		rest = rest % VII;
		
		int qI = rest/I;
		rest = rest % I;
		
		//here we loop and print each roman symbol, until the counter is 0.
		while (qM > 0) {
			System.out.print(" M ");
			qM--;
		}
		while (qD > 0) {
			System.out.print(" D ");
			qD--;
		}
		while (qC > 0) {
			System.out.print(" C ");
			qC--;
		}
		while (qL > 0) {
			System.out.print(" L ");
			qL--;
		}
		while (qX > 0) {
			System.out.print(" X ");
			qX--;	
		}
		while (qIX > 0) {
			System.out.print(" IX ");
			qIX--;
		}
		while (qVIII > 0) {
			System.out.print(" VIII ");
			qVIII--;
		}
		while (qVII > 0) {
			System.out.print(" VII ");
			qVII--;
		}
		while (qVI > 0) {
			System.out.print(" VI ");
			qVI--;
		}
		while (qV > 0) {
			System.out.print(" V ");
			qV--;
		}
		while (qIV > 0) {
			System.out.print(" IV ");;
			qIV--;
		}
		while (qIII > 0) {
			System.out.print(" III ");
			qIII--;
		}
		while (qII > 0) {
			System.out.print(" II ");
			qII--;
		}
		while (qI > 0) {
			System.out.print(" I ");
			qI--;
		}
		scan.close();
		System.exit(0);
	}
}
