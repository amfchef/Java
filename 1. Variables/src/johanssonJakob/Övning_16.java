package johanssonJakob;
import java.util.Scanner;
/**
 * 
 * Write a program that reads in an integer and breaks it into a sequence of individual
 * digits. For example, the input 16384 is displayed as
 * 1 6 3 8 4
 * You may assume that the input has no more than five digits and is not negative.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_16 {

	public static void main(String[] args) {
		int value= 1;
		for( int i= 0; i< 8; i++) {
			System.out.print(value+ ", ");
			value*= 4;}
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter a five digits, positive number: ");	//  12345
		int input = scan.nextInt();
		scan.close();
		int num1, num2, num3, num4, num5;
		
		num1 = input / 10000;
		input = input % 10000;
		num2 = input / 1000;
		input = input % 1000;
		num3 = input / 100;
		input = input % 100;
		num4 = input / 10;
		input = input % 10;
		num5 = input % 10;
		
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
		System.exit(0);*/
	}

}
