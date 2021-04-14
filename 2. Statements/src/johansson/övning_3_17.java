package johansson;
import java.util.Scanner;
/**
 * When two points in time are compared, each given as hours (in military time, ranging
 * from 0 and 23) and minutes, the following pseudocode determines which comes
 * first.
 *  * <ol>
 * <li> If hour1 < hour2 </li>
 * <li> time1 comes first.</li>
 * <li> Else if hour1 and hour2 are the same</li>
 * <li> If minute1 < minute2</li>
 * <li> time1 comes first.</li>
 * <li> Else if minute1 and minute2 are the same</li>
 * <li> Else</li>
 * <li> time2 comes first.</li>
 * <li> time1 and time2 are the same.</li>
 * </ol>
 * Write a program that prompts the user for two points in time and prints the time that
 * comes first, then the other time.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Time frame 1: \nPlease enter the time in military time: ");
		int time1 = scan.nextInt();
		int hours1 = time1 / 100;	//here we split the digits from the time between hours and mins
		int mins1 = time1 % 100;
		
		System.out.println("Time frame 1: \nPlease enter the time in military time: ");
		int time2 = scan.nextInt();
		int hours2 = time2 / 100;//here we split the digits from the time between hours and mins
		int mins2 = time2 % 100;
		
		if(hours1 < hours2) {	//if statement to see which time frame is before the other timeframe
			System.out.println(time1 + " comes before " + time2);
		}
		else if(hours1 == hours2){
			if(mins1 < mins2) {
				System.out.println(time1 + " comes before " + time2);
			}
			else if(mins1 == mins2) {
				System.out.println(time1 + " are the same time as " + time2);
			}
			else {
				System.out.println(time2 + " comes before " + time1);
			}
		}
		else {
			System.out.println(time2 + " comes before " + time1);
		}
		scan.close();
		System.exit(0);
	}

}
