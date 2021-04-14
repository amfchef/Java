package arrays_kap6;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * public static int removeAtIndex(int index, int[] inArray) som tar bort
 * elementet på den inskickade indexplatsen OCH returnerar det elementet som
 * stod på den platser. Kom ihåg att ”fylla igen” gapet som blev. Eftersom vi
 * inte kan skapa en ny kortare array och returnera referensen till den (return
 * är ju redan upptaget med elementet som plockats bort) så får vi nöja oss med
 * att vi får en delvis fylld array. Vänstershifta alla element till höger om
 * index som vi plockade bort. Ex: Arrayen före: [1, 2, 3, 4, 5] Arrayen efter
 * att vi plockat bort index=2: [1, 2, 4, 5, 5] 3:an har plockats bort och alla
 * tal till höger om den har flyttats ett steg till vänster. Att sista talet
 * fortfarande är en 5:a spelar ingen roll, bara anropande metod håller reda på
 * att arrayen nu inte är helt fylld. Om vi vet att arrayen bara innehåller 4
 * aktuella värden (trots att den är 5 element lång) så fungerar det. Titta
 * gärna på uppgift 6.15 så kanske ni förstå mera.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_6_5_mod {
	static Random random = new Random();

	public static int removeAtIndex(int index, int[] inArray) {
		System.out.print("This is the new array with the input index removed and swapped: ");
		int[] newintArrayRandom = new int[6];
		// newintArrayRandom = inArray;
		for (int i = 0; i < inArray.length; i++) {
			if (i != index) {
				System.out.print(inArray[i] + " ");
			}
		}
		System.out.print(inArray[inArray.length - 1] + " ");
		System.out.println();
		return inArray[index];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("This is the original array: ");
		int[] intArrayRandom = new int[6]; // {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < intArrayRandom.length; i++) {
			int randomize = random.nextInt(50);
			intArrayRandom[i] = randomize;
			System.out.print(intArrayRandom[i] + " ");
		}
		System.out.println(
				"\nPlease enter an index that the programe will remove and replace with the last index's value: ");
		int removeAtIndex = scan.nextInt();
		if (removeAtIndex >= intArrayRandom.length) {
			System.out.println("Error!\nThe number you entered is too high!");
		} else {
			System.out.print("The index number you choosen was: " + removeAtIndex(removeAtIndex, intArrayRandom));
		}
		System.exit(0);
	}
}