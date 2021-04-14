
/**
 * Simulate a tally counter that can be used to admit a limited number of
 * people. First, the limit is set with a call public void setLimit(int maximum)
 * If the count button was clicked more often than the limit, simulate an alarm
 * by printing out a message “Limit exceeded”.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class TallyCounter2 {

	private int maximum;

	public void setLimit(int maximum) {
		this.maximum = maximum;
	}
	
	private int counter = 0;

	public TallyCounter2() {

	}

	public void count() {
		if (counter + 1 > maximum) {
			System.out.println("The Limit has beed reached");
		} else {

			this.counter++;
		}
	}
	public int getValue() {
		return this.counter;

	}

	public void reset() {
		this.counter = 0;

	}

	}
