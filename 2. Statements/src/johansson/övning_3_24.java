package johansson;
import java.util.Scanner;
/**
 * Unit conversion. Write a unit conversion program that asks the users from which
 * unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to
 * convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions (such as gal
 * → km). Ask for the value to be converted, then display the result:
 * <ol>
 * <li>Convert from? gal </li>
 * <li>Convert to? ml </li>
 * <li>Value? 2.5 </li>
 * <li>2.5 gal = 9462.5 ml </li>
 * </ol>
 * 
 * @version 11-09-2020
 * @author Jakob Johansson
 * <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class övning_3_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to your personal unit converter \nwhich system would you like to convert from? Metric or Imperial System?");
		String metricOrImperial = scan.nextLine().toLowerCase();
		if (metricOrImperial.equals("metric")){
			System.out.println("Enter which unit you would like to convert from: \nVolume: \nml \nl \nWEIGHT: \ng \nkg \nDISTANCE: \nmm \ncm \nm \nkm ");
			String unitConverterMetric = scan.nextLine().toLowerCase();
			
			if (unitConverterMetric.equals("kg")) {
				System.out.println("How many kg: ");
				double kg = scan.nextDouble();
				System.out.println(kg + " kg equals: \n" + kg*2.2 + " pounds\n" + kg*35 + " ounces\n");
			}
			else if (unitConverterMetric.equals("g")) {
				System.out.println("How many g: ");
				double g = scan.nextDouble();
				System.out.println(g + " g equals: \n" + g*0.0022 + " pounds\n" + g*0.03 + " ounces\n");
			}
			else if (unitConverterMetric.equals("m")) {
				System.out.println("How many m: ");
				double m = scan.nextDouble();
				System.out.println(m + " m equals: \n" + m*39 + " inches\n" + m*3.2+ " feet\n" + m*0.00062 + " miles");
			}
			else if (unitConverterMetric.equals("cm")) {
				System.out.println("How many cm: ");
				double cm = scan.nextDouble();
				System.out.println(cm + " cm equals: \n" + cm*0.39 + " inches\n" + cm*0.03 + " feet\n" + cm*0.0000062 + " miles");
			}
			else if (unitConverterMetric.equals("mm")) {
				System.out.println("How many m: ");
				double mm = scan.nextDouble();
				System.out.println(mm + " mm equals: \n" + mm*0.039 + " inches\n" + mm*0.0032+ " feet\n" + mm*0.00000062 + " miles");
			}
			else if (unitConverterMetric.equals("l")) {
				System.out.println("How many litre: ");
				double l = scan.nextDouble();
				System.out.println(l + " litre equals: \n" + l*33.8 + " fluid ounces\n" + l*0.22+ " gallons\n");
			}
			else if (unitConverterMetric.equals("ml")) {
				System.out.println("How many ml: ");
				double ml = scan.nextDouble();
				System.out.println(ml + " ml equals: \n" + ml*0.0338 + " fluid ounces\n" + ml*0.00022+ " gallons\n");
			}
			else {
				System.out.println("Error!\ninvalid input");
			}
			
		}
		if (metricOrImperial.equals("imperial")){
			System.out.println("Enter which unit you would like to convert from:\n VOLUME: \nfl. \noz \ngal\n WEIGHT: \nlb \nin \nDISTANCE  \nfeet \nmile ");
			String unitConverterImperial= scan.nextLine().toLowerCase();
			if (unitConverterImperial.equals("feet")) {
				System.out.println("How many feet: ");
				double feet = scan.nextDouble();
				System.out.println(feet + " feet equals: \n" + feet*30.48 + " cm\n" + feet*304.8 + " mm\n" + feet*0.305 + " m\n" + feet*0.0003 + " km");
			}
			else if (unitConverterImperial.equals("mile")) {
				System.out.println("How many miles: ");
				double mile = scan.nextDouble();
				System.out.println(mile + " mile equals: \n" + mile*160934 + " cm\n" + mile*1609340 + " mm\n" + mile*1600 + " m\n" + mile*1.6 + " km");
			}
			else if (unitConverterImperial.equals("in")) {
				System.out.println("How many inches: ");
				double inches = scan.nextDouble();
				System.out.println(inches + " inches equals: \n" + inches*2.5 + " cm\n" + inches*25 + " mm\n" + inches*0.025 + " m\n" + inches*0.000005 + " km");
			}
			else if (unitConverterImperial.equals("fl")) {
				System.out.println("How many fluid onces: ");
				double fl = scan.nextDouble();
				System.out.println(fl + " fluid onces equals: \n" + fl*29.6 + " ml\n" + fl*0.03 + " l\n");
			}
			else if (unitConverterImperial.equals("gal")) {
				System.out.println("How many gallon : ");
				double gal = scan.nextDouble();
				System.out.println(gal + " gallon equals: \n" + gal*45.46 + " ml\n" + gal*4.5 + " l\n");
			}
			else if (unitConverterImperial.equals("oz")) {
				System.out.println("How many ounces: ");
				double ounces = scan.nextDouble();
				System.out.println(ounces + " ounces equals: \n" + ounces*28 + " g\n" + ounces*0.028 + " kg\n");
			}
			else if (unitConverterImperial.equals("ib")) {
				System.out.println("How many pounds: ");
				double pounds = scan.nextDouble();
				System.out.println(pounds + " pounds equals: \n" + pounds*453 + " g\n" + pounds*0.45 + " kg\n");
			}
			else {
				System.out.println("Error!\ninvalid input");
			}
		}
		else {
			System.out.println("Error \nInvalid input");
		}
		scan.close();
		System.exit(0);
	
	

		}}
