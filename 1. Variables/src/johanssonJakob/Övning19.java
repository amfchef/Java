package johanssonJakob;
import java.util.Scanner;
/**
 * 
 * Write a program that transforms numbers 1, 2, 3, …, 12
 * into the corresponding month names January, February,
 * March, …, December. Hint: Make a very long string "January
 * February March ...", in which you add spaces such that each
 * month name has the same length. Then use substring
 * to extract the month you want.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning19 {

	public static void main(String[] args) {
		String months = "Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec";
		Scanner scan = new Scanner(System.in);
		int startIndex = 0;
        int endIndex = 0;
        int addFour = 4;
        int seven = 7;
        boolean coninuePlaying = true;
        while(coninuePlaying)
        {
        System.out.println("What number of months do you want?");
        int numberOfMonth = scan.nextInt();
        
        
        switch (numberOfMonth) {
        case 1:
        	startIndex = 0;
        	endIndex = 3;
        	break;
        case 2:
        	startIndex = addFour;
        	endIndex = 7;
        	break;
        case 3:
        	startIndex = addFour * 2;
        	endIndex = 11;
        	break;
        case 4:
        	startIndex = addFour * 3;
        	endIndex = 15;
        	break;
        case 5:
        	startIndex = addFour * 4;
        	endIndex = 19;
        	break;
        case 6:
        	startIndex = addFour * 5;
        	endIndex = 23;
        	break;
        case 7:
        	startIndex = addFour * 6;
        	endIndex = 27;
        	break;
        case 8:
        	startIndex = addFour * 7;
        	endIndex = 31;
        	break;
        case 9:
        	startIndex = addFour * 8;
        	endIndex = 35;
        	break;
        case 10:
        	startIndex = addFour * 9;
        	endIndex = 39;
        	break;
        case 11:
        	startIndex = addFour * 10;
        	endIndex = 43;
        	break;
        case 12:
        	startIndex = addFour * 11;
        	endIndex = 47;
        	break;
        default:
        	System.out.println("Error \ninvalid menu choice");
        }
        System.out.println(months.substring(startIndex, endIndex));
        months.substring(startIndex, endIndex);
        }
        scan.close();
		System.exit(0);
	}

	

}
