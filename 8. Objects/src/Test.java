import java.util.Random;

/**
 * Test
 * 
 * @version 22-10-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Test {

	public static void main(String[] args) {

		{ // övning 1_tallyCaounter
			/*
			 * TallyCounter tallyCounter = new TallyCounter(); tallyCounter.count();
			 * tallyCounter.count(); tallyCounter.count();
			 * System.out.println("The value of the Tallycounter is: " +
			 * tallyCounter.getValue());
			 */
			// övning 2_tallyCounter
			/*
			 * TallyCounter2 TallyCounterLimit = new TallyCounter2();
			 * TallyCounterLimit.setLimit(10); TallyCounterLimit.count();
			 * TallyCounterLimit.reset(); TallyCounterLimit.count();
			 * System.out.println("The value of the Tallycounter is: " +
			 * TallyCounterLimit.getValue());
			 */
			// Övning_8_5
			/*
			 * SodaCan_8_5 sodaCanMeasure = new SodaCan_8_5(5, 1);
			 * System.out.println("Volume: " + sodaCanMeasure.getVolume());
			 * System.out.println("Surface Area: " + sodaCanMeasure.getSurfaceArea());
			 */
			/*
			 * Övning 8_6 Car_8_6 myCar = new Car_8_6(10); myCar.addPetrol(20); // Tank 20 L
			 * myCar.drive(100); // Drive 100 km System.out.println(myCar.getPetrolLevel());
			 * // Print remaining petrol
			 */
			// Övning 8_7
			/*
			 * Student_8_7 student = new Student_8_7(); student.getName();
			 * System.out.print("The scores are the following:\t\t");
			 * student.addQuiz(50);//adding scores, 50, 70, 30 student.addQuiz(20);
			 * student.addQuiz(30);
			 * System.out.print("\nThe total scores are the following:\t");
			 * student.getTotalScore();//printing out the total scores of all quizes
			 * System.out.print("\nThe average scores are the following:\t");
			 * student.getAverageScore();//prining out the average scores
			 */
			// övning_8_12 Bugsy
			/*
			 * bug_8_12 bugBugsy = new bug_8_12(10); bugBugsy.move(); bugBugsy.turn();
			 * bugBugsy.move(); System.out.println(bugBugsy.getPosition());
			 */
			// övning_8_14
			SodaCan_8_5 cylinder = new SodaCan_8_5(5, 2);
			System.out.printf("The volume of the cylinder is: \t%.2f%n", 
					cylinder.getVolume());

			System.out.printf("The cylinder surface area is: \t%.2f%n", 
					cylinder.getSurfaceArea());
			
			System.out.printf("The volume of the cylinder is: \t%.2f%n", 
					Geometry.cylinderVolume(2, 5));

			System.out.printf("The cylinder surface area is: \t%.2f", 
					Geometry.cylinderSurfaceArea(2, 5));

			// egen_1
			/*
			 * egen_1 dice = new egen_1();
			 * 
			 * System.out.println("The sum of the dices are: " + dice.getValue());
			 */
		}
	}
}
