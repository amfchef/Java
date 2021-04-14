package arrays_kap6;

import java.util.Random;

/**
 * 
 * Write a method public static boolean sameSet(int[] a, int[] b) that checks
 * whether two arrays have the same elements in some order, ignoring duplicates.
 * For example, the two arrays 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 would be
 * considered identical. You will probably need one or more helper methods.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_10 {

	static Random random = new Random();
	public static boolean sameSet(int[] firstArray, int[] secondArray) {
		int counter = 0;
		for (int i = 0; i < firstArray.length; i++) {
			
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					counter++;
				}
			}
		}
		if (counter == firstArray.length) {
			return true;
		} else {
			return false;
		}
	}

	public static void anyNumberTheSame(int[] firstArray, int[] secondArray) {
		int counter = 0;
		for (int i = 0; i < firstArray.length; i++) {
			// System.out.print(firstArray[i] + " ");

			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					counter++;
					System.out.print("\nThe number: " + secondArray[j] + " is a dublicate from the arrays");
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.print("This is the first array: \t");
		int[] firstIntArrayRandom = new int[6]; // { 1, 2, 3, 4, 5, 6 };
		int[] secondIntArrayRandom = new int[6]; // { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < firstIntArrayRandom.length; i++) {
			int randomize = random.nextInt(50);
			firstIntArrayRandom[i] = randomize;
			System.out.printf(" %2d ", firstIntArrayRandom[i]);

		}
		System.out.print("\nThis is the second array: \t");
		for (int i = 0; i < secondIntArrayRandom.length; i++) {
			int randomize = random.nextInt(50);
			secondIntArrayRandom[i] = randomize;
			System.out.printf(" %2d ", secondIntArrayRandom[i]);
		}
		System.out.print(
				"\nThe statement if the arrays are equal: " + sameSet(firstIntArrayRandom, secondIntArrayRandom));
		anyNumberTheSame(firstIntArrayRandom, secondIntArrayRandom);
		System.exit(0);
	}
}