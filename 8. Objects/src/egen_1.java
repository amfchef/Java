import java.util.Random;

/**
 * P8.egen1 (denna hittar ni garanterat på nätet men försök 
 * att skriva den själv) Skriv en tärningsklass 
 * Dice som har ett värde (antalet prickar på den sida som ligger upp) 
 * mellan 1 och 6. Det skall finnas en konstruktor som slumpar ett värde 
 * och en metod 
 * roll() som också slumpar ett nytt värde. Sedan skall även 
 * getValue() finnas för att hämta det värde som visas. 
 * UML diagrammet ser ut så här: Använd Random objektet för att skapa slumptal. 
 * Skriv ett lämpligt testprogram.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class egen_1 {
	Random randomize = new Random();
	private int quantiesOfDices = 0;

	private int sum = 0;
	
	public int generateDices() {
		quantiesOfDices = randomize.nextInt((10 - 1) + 1) + 1;
		return quantiesOfDices;
	}
	public int roll() {
		
		return randomize.nextInt((6 - 1) + 1) + 1;
	}
	public int getValue() {
		int random = generateDices();
		System.out.println("The quantities of dices: " + quantiesOfDices);
		int add;
		System.out.println("The result of the dices are below:");
		for (int i = 1; i <= quantiesOfDices; i++) {
			add = roll();
			System.out.print(add + "\t");
			sum += add;
		}
		System.out.println();
		return sum;
	}
}