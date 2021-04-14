package johansson;
import java.util.Scanner;
/**
 * Skriv ett program som frågar efter en persons personnummer plus kön och sedan kontrollerar att numret är korrekt. Inmatningen sker på lämpligt sätt och programmet svarar 
 * med lämplig text. För fakta omhur ett personnummer kontrolleras s
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_extra_1 {
	public static Scanner scan = new Scanner(System.in);
	
	public static boolean checkingSocialSecurityNum (String socialSecurityNum) {
		boolean correctNum;
			int length = String.valueOf(socialSecurityNum).length();
			if (length == 10) {
				correctNum = true;
			}
			else {
				correctNum = false;
			}
			return correctNum;
	}
	/*public static int checkGender (String socialSecurityNum){
		boolean checkGender = true;
		//int last3digits = Integer.toString(socialSecurityNum);
		
		String personNr = String.valueOf(socialSecurityNum);
		//int String.valueOf(socialSecurityNum)
		
		
		int last3digits = personNr % 10000; //123456 78x0
		return last3digits;
	}*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your social security number in the right format [YYMMDDxxxx]: ");
		boolean correctNumOfDigits;
		String gender;
		String socialSecurityNumber = null;
		if (scan.hasNextLine()) {
			socialSecurityNumber = scan.next();
			correctNumOfDigits = checkingSocialSecurityNum(socialSecurityNumber);
			System.out.println(correctNumOfDigits);
		}
		else {
			
			System.err.println("Error! \n invalid format");
			System.exit(0);
		}
		
		//int personNr = Integer.parseInt(socialSecurityNumber);
		
		//personNr = personNr % 10000;
		
		//int personNr = parseInt(socialSecurityNumber);
		//int i = Integer.parseInt(socialSecurityNumber);
		//personNr = personNr % 1000000;
		String i = socialSecurityNumber.substring(9, 10);
		//Integer i=Integer.valueOf(socialSecurityNumber);
		System.out.println(socialSecurityNumber + " " + i);
		
		//9009172413
		//if (correctNumOfDigits == true) {
			//System.out.print("Please enter your gender [Male/Female: ");
			//if (scan.hasNextLine()) {
				//gender = scan.nextLine();
				/*long check = checkGender(socialSecurityNumber);
				//System.out.println(check);
				
		}int personNr = Integer.parseInt(socialSecurityNum);
		
		//Long check = checkGender();
		
		/*
		if (scan.hasNextInt()) {
			socialSecurityNumber = scan.nextInt();
			int length = String.valueOf(socialSecurityNumber).length();
			System.out.println(correctNumOfDigits);
			System.out.print(length);
			
			if (length == 10) {
				//correct
			}
			else {
				System.err.println("Error! \n invalid format");
				System.exit(0);
			}
			}
		else {
			System.err.println("Error! \n invalid format");
			System.exit(0);
		}	*/
			
			
		scan.close();
		System.exit(0);
	}
	

}
