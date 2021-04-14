package johansson;
import java.util.Scanner;
/**
 * 
 * Write a program that reads three numbers and prints “all the same” if they are all the
 * same, “all different” if they are all different, and “neither” otherwise.
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_4 {
	
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = scan.nextInt();
		System.out.println("Enter your second number");
		int num2 = scan.nextInt();
		System.out.println("Enter your third number");
		int num3 = scan.nextInt();
		scan.close();
	
		if (num1 == num2 && num2 == num3 && num3 == num1) {
			System.out.println("All the same numbers!");
		}
		else if (num1 != num2 && num2 != num3 && num3 != num1) {
			System.out.println("All different numbers!");
		}
		else {
			System.out.println("neither!");
		}
		System.out.println("The numbers are: " + num1 +" " + num2 + " " + num3);
		System.exit(0);
	}
}