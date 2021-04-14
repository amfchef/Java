package arrays_kap6;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Tips: Skapa en ny array som är lika lång som originalet. Skapa en loop som
 * snurrar från första elementet till sista. Kopiera från originalet till den
 * nya. Trixet är att få indexet för originalet att stiga samtidigt som index
 * för den nya sjunker. Svaret är lite enkel matte: om ’i’ går från 0 till 5 så
 * kommer (5 – ’i’) gå från 5 till 0.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_7 {
	static Random random = new Random();

	public static void revers(int[] intArray) {
		int[] newintArrayRandom = intArray.clone();

		for (int i = intArray.length - 1; i >= 0; i--) {
			System.out.print(intArray[i] + " ");
		}
	}
	public static void main(String[] args) {

		System.out.print("This is the original array: \t\t");
		int[] intArrayRandom = new int[6]; // {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < intArrayRandom.length; i++) {
			int randomize = random.nextInt(50);
			intArrayRandom[i] = randomize;
			System.out.print(intArrayRandom[i] + " ");
		}
		System.out.println();
		System.out.print("This is the same array in reverse: \t");
		revers(intArrayRandom);
		System.exit(0);
	}

}
