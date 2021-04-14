/**
 * We want to add a button to the tally counter in Section 8.2 that allows an
 * operator to undo an accidental button click. Provide a method public void
 * undo() that simulates such a button. As an added precaution, make sure that
 * the operator cannot click the undo button more often than the count button.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class TallyCounter {

	private int counter = 0;

	

	public void count() {
		this.counter++;

	}

	public int getValue() {
		return this.counter;

	}

	public void reset() {
		this.counter = 0;

	}

	public void undo() {
		if (counter > 0) {
			this.counter--;
		}
		else {
			System.out.println("The counter is all ready on 0 ");
		}
	}
}