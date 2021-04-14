/**
 * 
 * Write a program that prints a multiplication table
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_4_19 {

	public static void main(String[] args) {
		System.out.println("Welcome to your own multiplication table\nEnjoy");
		System.out.println("	Table-> 1:an	2:an	3:an	4:an	5:an	6:an	7:an	8:an	9:an	10:an");
		for (int row = 1; row <= 10; row++) {
			System.out.print("\t" + row + "-->\t");
			
			for (int column = 1; column <= 10; column++) {
				System.out.print(row * column +"\t");
			}
			System.out.println();
		}		
		System.exit(0);
	}
}
