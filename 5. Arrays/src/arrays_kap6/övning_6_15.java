package arrays_kap6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Write a program that produces ten random permutations of the numbers 1 to 10.
 * To generate a random permutation, you need to fill an array with the numbers
 * 1 to 10 so that no two entries of the array have the same contents. You could
 * do it by brute force, by generating random values until you have a value that
 * is not yet in the array. But that is inefficient. Instead, follow this
 * algorithm.
 * 
 * Make a second array and fill it with the numbers 1 to 10. 
 * Repeat 10 times
 * 		Pick a random element from the second array. 
 * 		Remove it and append it to the permutation array.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_15 {

	static Random random = new Random();
	static final int size = 10;

	public static ArrayList<Integer> getOneRandomPermutation() {

		ArrayList<Integer> firstArray = new ArrayList<>();

		for (int i = 1; i < size + 1; i++) // loop each element from the first array
		{
			firstArray.add(i);
		}

		ArrayList<Integer> permutatedArray = new ArrayList<>();

		for (int j = 0; j < size; j++) // looping 10 times, and adding and removing random numbers from both arrays
		{
			int position = random.nextInt(firstArray.size());
			permutatedArray.add(firstArray.get(position));
			firstArray.remove(position);
		}

		return permutatedArray;
	}

	public static void getTenRandomPermutations() {

		for (int i = 0; i < size; i++) // looping 10 times one for each permutaion
		{
			for (Integer randomNum : getOneRandomPermutation()) // looping 10 times and for each time, calling the
																// method
			{
				System.out.printf("%4d", randomNum);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Here is 10 random permutaion below: ");
		getTenRandomPermutations();
		System.exit(0);
	}

}
