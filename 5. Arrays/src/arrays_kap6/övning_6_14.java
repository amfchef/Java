package arrays_kap6;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Write a program that generates a sequence of 20 random values between 0 and
 * 99 in an array, prints the sequence, sorts it, and prints the sorted
 * sequence. Use the sort method from the standard Java library.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_14 {
	public static int[] getRandomArray() {
		int[] IntArrayRandom = new int[20]; // { 1, 2, 3, 4, 5, 6 };
		// System.out.println();
		for (int i = 0; i < IntArrayRandom.length; i++) {
			int randomize = random.nextInt(99);
			IntArrayRandom[i] = randomize;
			System.out.printf(" %2d ", IntArrayRandom[i]);
		}
		return IntArrayRandom;
	}
	static Random random = new Random();

	public static void main(String[] args) {
		System.out.println("This is the original array:");
		int[] IntArrayRandom = getRandomArray();
		Arrays.sort(IntArrayRandom);
		System.out.println("\nThis is the same array sorted with the smallest number to the left:");
		for (int i = 0; i < IntArrayRandom.length; i++) {
			System.out.printf(" %2d ", IntArrayRandom[i]);
		}
		System.exit(0);
	}
}
