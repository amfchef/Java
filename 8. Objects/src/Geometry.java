/**
 * Skriv en klass Geometry som innehåller två statiska (static) metoder: public
 * static double cylinderVolume(double radius, double height) public static
 * double cylinderSurfaceArea(double radius, double height) Skriv sedan ett
 * testprogram som dels använder sig av dessa två statiska metoder för att räkna
 * ut en cylinders volym och mantelarea och dels använder sig av klassen SodaCan
 * (som ju är en cylinder) för att göra samma sak.
 * 
 * @version 22-10-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Geometry {
	

	/**
	 * Calculating the cylinder volume, by calling the class "SodaCan_8_5"
	 * @param radius
	 * @param height
	 * @return
	 */
	public static double cylinderVolume(double radius, double height) {

		return Math.PI * height * Math.pow(radius, 2);
	}

	/**
	 * Calculating the cylinder surface area, by calling the class "SodaCan_8_5"
	 * 
	 * @param radius
	 * @param height
	 * @return
	 */
	public static double cylinderSurfaceArea(double radius, double height) {

		return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
	}

}
