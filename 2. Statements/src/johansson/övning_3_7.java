package johansson;
import java.util.Scanner;
/**
 * 
 * Write a program that reads in three integers and prints “in order” if they are sorted in
 * ascending or descending order, or “not in order” otherwise. For example,
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = scan.nextInt();
		System.out.println("Enter your second number");
		int num2 = scan.nextInt();
		System.out.println("Enter your third number");
		int num3 = scan.nextInt();
		scan.close();
		
		if (num1 < num2 && num2 < num3) {
			System.out.println(num1 + " " + num2 + " " + num3 + " In order");
		}
		else if (num1 > num2 && num2 > num3)
			System.out.println(num1 + " " + num2 + " " + num3 + " In order");
		else {
			System.out.println(num1 + " " + num2 + " " + num3 + " Not in order");
		}
		System.exit(0);
	}

}
