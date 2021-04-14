import java.util.Scanner;

/**
 * Implement a class SodaCan with methods getSurfaceArea() and getVolume(). In
 * the constructor, supply the height and radius of the can.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class SodaCan_8_5 {

	private double height;
    private double radius;

    public SodaCan_8_5(double h, double r) {
    	height = h;
        radius = r;
    }

    public double getVolume()
    {
        return Math.PI * height * Math.pow(radius, 2);
    }

    public double getSurfaceArea()
    {
        return (2 * Math.PI * radius * height) + 
        (2 * Math.PI * radius * radius);
    }   
   
}


