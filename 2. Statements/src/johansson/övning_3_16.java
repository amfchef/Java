package johansson;
import java.util.Scanner;
/**
 * Write a program that reads in three strings and sorts them lexicographically.
 *  * <ol>
 * <li> Able </li>
 * <li> Baker</li>
 * <li> Charlie</li>
 * </ol>
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter you first name: ");
		String name1= scan.nextLine().toLowerCase().trim();
		System.out.print("Enter you second name: ");
		String name2= scan.nextLine().toLowerCase().trim();
		System.out.print("Enter you third name: ");
		String name3= scan.nextLine().toLowerCase().trim();
		
		if (name2.compareTo(name1) > 0 && name3.compareTo(name1) > 0 && name3.compareTo(name2) > 0) {
			System.out.println(name1 + " " + name2 + " " + name3);
		}
		else if (name1.compareTo(name2) > 0 && name3.compareTo(name2) > 0 && name3.compareTo(name1) > 0) {
			System.out.println(name2 + " " + name1 + " " + name2);
		}
		else if (name1.compareTo(name3) > 0 && name2.compareTo(name3) > 0 && name3.compareTo(name1) > 0) {
			System.out.println(name3 + " " + name1 + " " + name2);
		}
		else if (name1.compareTo(name3) > 0 && name2.compareTo(name3) > 0 && name1.compareTo(name2) > 0) {
			System.out.println(name3 + " " + name2 + " " + name1);
		}
		else if (name2.compareTo(name1) > 0 && name3.compareTo(name1) > 0 && name2.compareTo(name3) > 0) {
			System.out.println(name1 + " " + name3 + " " + name2);
		}
		else if (name1.compareTo(name2) > 0 && name3.compareTo(name2) > 0 && name1.compareTo(name3) > 0) {
			System.out.println(name2 + " " + name3 + " " + name1);
		}
		else {
			System.err.println("Error \ninvalid please try again");
		}
		scan.close();
		System.exit(0);
	}

}
