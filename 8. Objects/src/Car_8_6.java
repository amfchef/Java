/**
 * Implement a class Car with the following properties. A car has a certain
 * fuel efficiency (measured in miles/gallon) and a certain amount of fuel
 * in the gas tank. The efficiency is specified in the constructor, and the
 * initial fuel level is 0. Supply a method drive that simulates driving the
 * car for a certain distance, reducing the fuel level in the gas tank, and methods getGas-
 * Level, to return the current fuel level, and addGas, to tank up. Sample usage:
 * 		Car myHybrid = new Car(50); // 50 miles per gallon
 * 		myHybrid.addGas(20); // Tank 20 gallons
 * 		myHybrid.drive(100); // Drive 100 miles
 * 		System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Car_8_6 {

	public Car_8_6(int kmPerLiter) {
		this.kmPerLiter = kmPerLiter;
	}
	private int liters = 0;
	
	private int kilometers;
						
	private int kmPerLiter;	
	
	public void addPetrol(int liters) {
		this.liters =+ liters; 
		
	}
	public void drive(int kilometer) {
		this.kilometers = kilometer;
	}
	public double getPetrolLevel() {
		return liters - (kilometers / kmPerLiter);
		
	}
}
