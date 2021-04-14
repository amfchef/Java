package arrays_kap6;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Write a program that initializes an array with ten random integers and then
 * prints four lines of output, containing Every element at an even index. Every
 * even element. All elements in reverse order. Only the first and last element.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_1 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] intArrayRandom = new int[10];
		System.out.print("This is the original array: \t\t\t");
		for (int i = 0; i < 10; i++) {
			int randomize = random.nextInt(50);
			intArrayRandom[i] = randomize;
			System.out.print(intArrayRandom[i] + " ");
		}
		System.out.print("\nPrinting out every even index:\t\t\t");
		for (int i = 0; i < intArrayRandom.length; i++) {
			if (i % 2 == 0) {
				System.out.print(intArrayRandom[i] + " ");
			}
		}
		System.out.print("\nPrinting out every even elements:\t\t");
		for (int i = 0; i < intArrayRandom.length; i++) {
			if (intArrayRandom[i] % 2 == 0) {
				System.out.print(intArrayRandom[i] + " ");
			}
		}
		System.out.print("\nPrinting out every elements in reverse:\t\t");
		for (int i = intArrayRandom.length - 1; i >= 0; i--) {

			System.out.print(intArrayRandom[i] + " ");
		}
		System.out.print("\nPrinting out the first and last elements: \t");
		for (int i = 0; i < intArrayRandom.length; i++) {
			if (i == 0 || i == intArrayRandom.length-1) {
				System.out.print(intArrayRandom[i] + " ");
			}
		}
		System.exit(0);
	}
}
