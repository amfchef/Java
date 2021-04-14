package arrays_kap6;

import java.util.Random;

/**
 * 
 * Write array methods that carry out the following tasks for an array of
 * integers. For each method, provide a test program. a. Swap the first and last
 * elements in the array. b. Shift all elements by one to the right and move the
 * last element into the first position. For example, 1 4 9 16 25 would be
 * transformed into 25 1 4 9 16. d. Replace each element except the first and
 * last by the larger of its two neighbors. e. Remove the middle element if the
 * array length is odd, or the middle two elements if the length is even. h.
 * Return true if the array is currently sorted in increasing order.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_2e {
	static Random random = new Random();

	public static void removeArrayElements(int number[]) {
		int middle = 0;
		int middleEven = 0;
		System.out.print("\n Printing out every index: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");

		}
		if (number.length % 2 == 0) {
			middle = number.length / 2;
			middleEven = middle - 1;
			System.out.println(middle + " " + middleEven + " ");
			for (int i = 0; i < number.length; i++) {
				if (i != middle && i != middleEven) {
					System.out.print(number[i] + " ");
				}
			}
		} else {
			System.out.println();
			middle = (number.length - 1) / 2;

			for (int i = 0; i < number.length; i++) {
				if (i != middle) {
					System.out.print(number[i] + " ");
				}
			}
			System.out.print("\n " + middle + " " + number[middle]);
		}
	}

	public static void main(String[] args) {
		int[] intArrayRandom = new int[6];
		for (int i = 0; i < intArrayRandom.length; i++) {
			int randomize = random.nextInt(50);
			intArrayRandom[i] = randomize;
		}
		removeArrayElements(intArrayRandom);
		System.exit(0);
	}

}
