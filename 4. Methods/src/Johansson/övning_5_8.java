package Johansson;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * 
 * It is a well-known phenomenon that most people are easily able to read a text
 * whose words have two characters flipped, provided the first and last letter
 * of each word are not changed. For example, I dn’ot gvie a dman for a man taht
 * can olny sepll a wrod one way. (Mrak Taiwn) Write a method String
 * scramble(String word) that constructs a scrambled version of a given word,
 * randomly flipping two characters other than the first and last one. Then
 * write a program that reads words and prints the scrambled words.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_5_8 {

	public static String scramble(String input) {
		if (input.length() <= 3) {
			return input;
		} else {
			Random random = new Random();
			StringBuilder newWord = new StringBuilder(input);

			int pos1 = random.nextInt(input.length() - 2) + 1;
			int pos2 = random.nextInt(input.length() - 2) + 1;
			System.out.println(pos1 + " " + pos2);
			newWord.setCharAt(pos1, newWord.charAt(pos2));
			newWord.setCharAt(pos2, input.charAt(pos1));

			return newWord.toString();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String input = scan.nextLine();
		scan.close();
		System.out.println("This programe scrambled the words like this: " + scramble(input));
		System.exit(0);
	}
}
