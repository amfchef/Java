package Johansson;
import java.util.Scanner;



/**
 * 
 * Write a recursive method
 * public static String reverse(String str)
 * that computes the reverse of a string. For example, reverse("flow") should return
 * "wolf". Hint: Reverse the substring starting at the second character, then add the first
 * character at the end. For example, to reverse "flow", first reverse "low" to "wol", then
 * add the "f" at the end.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Övning_5_15 {
	
	public static String reverse(String input) {
		
		//This is the reverse method that will check if the input length is more than one character, and if so, loop back to the method and redo it.
		//it will also print out the string in reverse
		if (input.length() >= 2){
			return reverse(input.substring(1)) + input.charAt(0);
		}
		else {
			return input;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a text, and this programe will write the text back in reverse:");
		String input = scan.nextLine();
		scan.close();
		System.out.println("The reversed text is below:\n" + reverse(input));
		System.exit(0);
	}

}
