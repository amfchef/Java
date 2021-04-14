package arrays_kap6;

import java.util.Random;
import java.util.Scanner;

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
public class övning_6_2 {
	
	static Random random = new Random();
	
	public static void swapFirstIndexToLast(int[] number) {
		int firstIndex = number[0];
		number[0] = number[number.length - 1];
		number[number.length - 1] = firstIndex;
		System.out.print("\nSwaping the first index with the last index: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}

	public static void increase(int[] number) {
		System.out.print("\nReplace each element except the first and last by the larger of its two neighbors: ");
		for (int i = 1; i < number.length - 1; i++) {
				if (number[i] < number[i - 1]) {
					number[i] = number[i-1];
				}
				if (number[i] < number[i+1]) {
					number[i] = number[i+1];
				}
			}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		}
	
	public static void shiftAllIndexNextRight(int[] number) {
		System.out.print("\nPrinting out the array with each elements moved to one unit to the right: ");
		System.out.print(number[4] + " ");
		for (int i = 0; i < number.length - 1; i++) {
			System.out.print(number[i] + " ");
		}
	}

	
	public static void main(String[] args) {
		//Random random = new Random();
		
		int[] intArrayRandom = new int[5];
		for (int i = 0; i < intArrayRandom.length; i++) {
			int randomize = random.nextInt(50);
			intArrayRandom[i] = randomize;
		}
		
		//intArrayCopy = intArrayRandom;
		System.out.print("Printing out every index: ");
		for (int i = 0; i < intArrayRandom.length; i++) {
			System.out.print(intArrayRandom[i] + " ");

		}
		final int intArrayCopy[] = intArrayRandom;
		final int intArrayCopy2[] = intArrayRandom;
		shiftAllIndexNextRight(intArrayRandom);
		intArrayRandom = intArrayCopy;
		increase(intArrayRandom);
		intArrayRandom = intArrayCopy;
		swapFirstIndexToLast(intArrayCopy);
		

	}
}