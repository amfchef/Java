package johansson;
import java.util.Scanner;
/**
 * övn 3.09
 * Write a program that reads a temperature value and the letter C for Celsius or F for
 * Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
 * at sea level.
 * 
 * övn 3.10
 * The boiling point of water drops by about one degree centigrade for every 300
 * meters (or 1,000 feet) of altitude. Improve the program of Exercise P3.9 to allow the
 * user to supply the altitude in meters or feet.
 * 
 * övn 3.11
 * Add error handling to Exercise P3.10. If the user does not enter a number when
 * expected, or provides an invalid unit for the altitude, print an error message and end
 * the program.
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter which unit of temperature: C/F ");
		String temperatureChoice = "";
		if (scan.hasNextLine()){
			temperatureChoice = scan.next();
		}
		
		else {
			System.err.println("Error \ninvalid format");
			System.exit(0);
		}
		if (temperatureChoice.equalsIgnoreCase("c") || temperatureChoice.equalsIgnoreCase("f")){	//making sure the input is right menushoice
			System.out.print("Please enter your altitude in metres: ");
			int altitude = 0;
			if (scan.hasNextInt()){
				altitude = scan.nextInt();
			}
			else {
				System.err.println("Error \ninvalid format");
				System.exit(0);
			}
		
			if (temperatureChoice.equalsIgnoreCase("f")) {
				double farenheit = 0;
				System.out.print("Enter the temperature in Farenheit: ");
			if (scan.hasNextDouble()){
				farenheit = scan.nextDouble();
				farenheit =- (altitude/150); //this number is taken from google
				}
			else {
				System.err.println("Error \ninvalid format");
				System.exit(0);
			}
			
			if (farenheit < 32) {
				System.out.println("Your water is solid/ice ");
			}
			else if (farenheit > 32 && farenheit < 212) {
				System.out.println("Your water is liquid ");
			}
			else {
				System.out.println("Your water is gaseous");
			}
		
			}
		
			else if(temperatureChoice.equalsIgnoreCase("c")) {
			System.out.print("Enter the temperature in Celsius: ");
			double celsius = 0;
			if (scan.hasNextDouble()){
				celsius = scan.nextDouble();
				celsius =- (altitude/300);
			}
			else {
				System.err.println("Error \ninvalid format");
				System.exit(0);
			}
			
			if (celsius < 0) {
				System.out.println("Your water is solid/ice ");
			}
			else if (celsius > 0 && celsius < 100) {
				System.out.println("Your water is liquid ");
			}
			else {
				System.out.println("Your water is gaseous");
			}
		}
		scan.close();
		System.exit(0);
		}
		else {
			System.err.print("Error \ninvalid format");
			System.exit(0);
		}
	}
		
		
		
	}


